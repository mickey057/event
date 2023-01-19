package com.event.blive.controller;


import com.event.blive.dao.VenueRepository;
import com.event.blive.model.Venue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VenueController {

    @Autowired
    private VenueRepository repository;

    @PostMapping("/saveVenue")
    public String saveVenue(@RequestBody Venue venue){

        repository.save(venue);
        return "venue Enregistrer...";
    }
    @GetMapping("/getAllVenue")
    public List<Venue> getAllvenue(){

        return repository.findAll();
    }
}
