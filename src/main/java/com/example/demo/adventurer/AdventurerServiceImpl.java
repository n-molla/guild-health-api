package com.example.demo.adventurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdventurerServiceImpl implements AdventurerService {

    @Autowired
    private AdventurerRepository repository;

    @Override
    public List<Adventurer> getAllAdventurers(){
        return repository.findAll();
    }

    @Override
    public Adventurer saveAdventurer(Adventurer adventurer){
        return repository.save(adventurer);
    }
}
