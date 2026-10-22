package com.example.gestionfoyertn.service;

import com.example.gestionfoyertn.repositories.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    private BlocRepository blocRepository;
}
