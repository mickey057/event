package com.event.blive.controller;


import com.event.blive.dao.GenreRepository;
import com.event.blive.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreController {

    @Autowired
    private GenreRepository repository;

    @PostMapping("/saveGenre")
    public String saveGenre(@RequestBody Genre genre){

        repository.save(genre);
        return "genre Enregistrer...";
    }
    @GetMapping("/getAllGenre")
    public List<Genre> getAllgenre(){

        return repository.findAll();
    }
}
