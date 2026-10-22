package com.example.gestionfoyertn.repositories;

import com.example.gestionfoyertn.entites.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Bloc, Long> {
}
