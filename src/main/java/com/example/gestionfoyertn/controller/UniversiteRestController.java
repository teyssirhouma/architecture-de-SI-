package com.example.gestionfoyertn.controller;

import com.example.gestionfoyertn.service.IBlocService;
import com.example.gestionfoyertn.service.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversiteRestController {
    @Autowired
    private IUniversiteService universiteService;
}
