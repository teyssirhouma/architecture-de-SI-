package com.example.gestionfoyertn.service;

import com.example.gestionfoyertn.repositories.BlocRepository;
import com.example.gestionfoyertn.repositories.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoyerServiceImpl implements IFoyerService{
    @Autowired
    private FoyerRepository foyerRepository;
}
