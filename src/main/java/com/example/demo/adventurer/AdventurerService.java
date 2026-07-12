package com.example.demo.adventurer;
import java.util.List;

public interface AdventurerService {
    List<Adventurer> getAllAdventurers();
    Adventurer saveAdventurer(Adventurer adventurer);
}
