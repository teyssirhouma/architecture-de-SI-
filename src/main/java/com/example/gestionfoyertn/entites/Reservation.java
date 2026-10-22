package com.example.gestionfoyertn.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    private String idReservation ;
    private String anneeUniversitaire;
    private Boolean estValid;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;
}

