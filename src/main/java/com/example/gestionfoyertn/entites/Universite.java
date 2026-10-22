package com.example.gestionfoyertn.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite ;
    private String nomUniversite ;
    private String adresse ;

    @OneToOne
    private Foyer foyer;
}
