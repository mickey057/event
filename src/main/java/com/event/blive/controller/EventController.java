package com.event.blive.controller;


import com.event.blive.dao.EventRepository;
import com.event.blive.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventRepository repository;

    @PostMapping("/saveEvent")
    public String saveEvent(@RequestBody Event event){

        repository.save(event);
        return "event Enregistrer...";
    }
    @GetMapping("/getAllEvent")
    public List<Event> getAllevent(){

        return repository.findAll();
    }
}
