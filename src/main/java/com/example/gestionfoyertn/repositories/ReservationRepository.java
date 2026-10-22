package com.example.gestionfoyertn.repositories;

import com.example.gestionfoyertn.entites.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Bloc, String> {
}
