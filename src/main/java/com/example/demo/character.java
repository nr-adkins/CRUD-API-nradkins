package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;  // field name matches getter/setter

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private String species;
    private String universe;
    private int age;

    // Default constructor
    public Character() {}

    // Parameterized constructor
    public Character(String name, String description, String species, String universe, int age) {
        this.name = name;
        this.description = description;
        this.species = species;
        this.universe = universe;
        this.age = age;
    }

    // Getters and setters
    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}