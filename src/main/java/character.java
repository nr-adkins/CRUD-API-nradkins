package com.example.demo.enity;

import jakarta.persitence;

@Entity
public class Character{
    @Id
    @GeneratedValue(strategy=GeneratinType.IDENTITY)
    private Long characterID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private String species;
    private String universe;
    private int age;

    public Character() {}

    public Character(String name, String description, String species, String universe, int age) {
        this.name = name;
        this.description = description;
        this.species = species;
        this.universe = universe;
        this.age = age;
    }

    
}