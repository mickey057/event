package com.event.blive.controller;


import com.event.blive.dao.RoleRepository;
import com.event.blive.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleRepository repository;

    @PostMapping("/saveRole")
    public String saveRole(@RequestBody Role role){

        repository.save(role);
        return "role Enregistrer...";
    }
    @GetMapping("/getAllRole")
    public List<Role> getAllrole(){

        return repository.findAll();
    }
}
