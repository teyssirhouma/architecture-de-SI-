package com.example.gestionfoyertn.service;

import com.example.gestionfoyertn.repositories.BlocRepository;
import com.example.gestionfoyertn.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements IReservationService{
    @Autowired
    private ReservationRepository reservationRepository;
}
