package com.example.gestionfoyertn.controller;

import com.example.gestionfoyertn.service.IBlocService;
import com.example.gestionfoyertn.service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantRestController {
    @Autowired
    private IEtudiantService etudiantService;
}
