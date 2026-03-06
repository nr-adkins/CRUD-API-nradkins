package com.example.demo.controller;

import com.example.demo.entity.Character;
import com.example.demo.service.CharacterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService service;

    public CharacterController(CharacterService service) {
        this.service = service;
    }

    @GetMapping
    public List<Character> getAllCharacters() {
        return service.getAllCharacters();
    }
    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable Long id) {
        return service.getCharacterById(id);
    }

    @PostMapping
    public Character addCharacter(@RequestBody Character character) {
        return service.addCharacter(character);
    }

    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable Long id, @RequestBody Character character) {
        return service.updateCharacter(id, character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        service.deleteCharacter(id);
    }
    @GetMapping("/universe/{universe}")
    public List<Character> getByUniverse(@PathVariable String universe) {
        return service.getByUniverse(universe);
    }

    @GetMapping("/search")
    public List<Character> searchCharacters(@RequestParam String name) {
        return service.searchByName(name);
    }
}