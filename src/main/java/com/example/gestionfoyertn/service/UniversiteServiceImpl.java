package com.example.gestionfoyertn.service;

import com.example.gestionfoyertn.repositories.BlocRepository;
import com.example.gestionfoyertn.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversiteServiceImpl implements IUniversiteService{
    @Autowired
    private UniversiteRepository universiteRepository;
}
