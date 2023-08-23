package com.example.itsec_01_Unsecure.controller;

import com.example.itsec_01_Unsecure.model.Person;
import com.example.itsec_01_Unsecure.repository.PersonRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicController {
    private final PersonRepo pRepo;

    public PublicController(PersonRepo pRepo) {
        this.pRepo = pRepo;
    }



    @PostMapping("/add")
    public String createPerson(@RequestBody Person p){
        pRepo.save(p);
        return "Person skapad";
    }
    }