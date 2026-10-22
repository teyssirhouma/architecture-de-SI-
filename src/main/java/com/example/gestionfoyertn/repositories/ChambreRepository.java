package com.example.gestionfoyertn.repositories;

import com.example.gestionfoyertn.entites.Bloc;
import com.example.gestionfoyertn.entites.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
