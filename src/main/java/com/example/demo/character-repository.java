package com.example.demo.repository;

import com.example.demo.entity.Charcter;
import org.springframework.data.jpa.repository,JpsRepository;
import java.util.list;

public interface CharacterRepository extends JpaRepositroy<Character, Long>{
    List<Character> findByUniverse( String universe);
    List<Character> findByNameContains(String name);
    
}