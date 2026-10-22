package com.example.gestionfoyertn.controller;

import com.example.gestionfoyertn.service.IBlocService;
import com.example.gestionfoyertn.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationRestController {
    @Autowired
    private IReservationService reservationService;
}
