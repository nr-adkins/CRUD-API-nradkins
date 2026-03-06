package com.example.demo.service;

import com.example.demo.entity.Character;
import com.example.demo.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService{
    private final CharacterRepository repository;

    public CharacterService(CharacterRepository repository){
        this.repository = repository;
    }
    public List<Character> getAllCharacters() {
        return repository.findAll();
    }

    public Character getCharacterById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Character addCharacter(Character character) {
        return repository.save(character);
    }

    public Character updateCharacter(Long id, Character character) {
        character.setCharacterId(id);
        return repository.save(character);
    }

    public void deleteCharacter(Long id) {
        repository.deleteById(id);
    }
    public List<Character> getByUniverse(String universe) {
        return repository.findByUniverse(universe);
    }

    public List<Character> searchByName(String name) {
        return repository.findByNameContaining(name);
    }
}