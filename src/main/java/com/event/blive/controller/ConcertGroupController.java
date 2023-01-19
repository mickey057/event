package com.event.blive.controller;


import com.event.blive.dao.ConcertGroupRepository;
import com.event.blive.model.ConcertGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConcertGroupController {

    @Autowired
    private ConcertGroupRepository repository;

    @PostMapping("/saveConcertGroup")
    public String saveConcertGroup(@RequestBody ConcertGroup concertGroup){

        repository.save(concertGroup);
        return "concertGroup Enregistrer...";
    }
    @GetMapping("/getAllConcertGroup")
    public List<ConcertGroup> getAllconcertGroup(){

        return repository.findAll();
    }
}
