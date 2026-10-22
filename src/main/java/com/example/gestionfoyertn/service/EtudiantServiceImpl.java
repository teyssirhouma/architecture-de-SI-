package com.example.gestionfoyertn.service;

import com.example.gestionfoyertn.repositories.BlocRepository;
import com.example.gestionfoyertn.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantServiceImpl implements IEtudiantService{
    @Autowired
    private EtudiantRepository etudiantRepository;
}
