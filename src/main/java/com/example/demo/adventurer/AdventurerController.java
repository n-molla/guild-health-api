package com.example.demo.adventurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adventurers")
public class AdventurerController {

    @Autowired
    private AdventurerService adventurerService;

    //Fetches a list of all Adventurers
    @GetMapping
    public List<Adventurer> getAllAdventurers(){
        return adventurerService.getAllAdventurers();
    }


    //Inserts a new Adventurer record
    @PostMapping
    public Adventurer saveAdventurer(@RequestBody Adventurer adventurer) {
        return adventurerService.saveAdventurer(adventurer);
    }
}
