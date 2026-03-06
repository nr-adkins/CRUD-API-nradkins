package com.example.demo.repository;

import com.example.demo.entity.Charcter;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.list;

public interface CharacterRepository extends JpaRepository<Character, Long>{
    List<Character> findByUniverse( String universe);
    List<Character> findByNameContains(String name);
    
}