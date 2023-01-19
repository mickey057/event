package com.event.blive.controller;


import com.event.blive.dao.ArtistRepository;
import com.event.blive.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {

    @Autowired
    private ArtistRepository repository;

    @PostMapping("/saveArtist")
    public String saveArtist(@RequestBody Artist artist){

        repository.save(artist);
        return "artist Enregistrer...";
    }
    @GetMapping("/getAllArtist")
    public List<Artist> getAllartist(){

        return repository.findAll();
    }
}
