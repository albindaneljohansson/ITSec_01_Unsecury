package com.example.itsec_01_Unsecure.controller;

import com.example.itsec_01_Unsecure.model.Person;
import com.example.itsec_01_Unsecure.repository.PersonRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    private final PersonRepo pRepo;

    public AdminController(PersonRepo pRepo) {
        this.pRepo = pRepo;
    }


    @RequestMapping("/all")
    public List<Person> getAllPersons(){return pRepo.findAll();}
}
