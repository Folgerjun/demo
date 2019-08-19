package com.example.jpadatarest.controller;

import com.example.jpadatarest.hello.Person;
import com.example.jpadatarest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PutMapping("/save")
    public String savePerson(Person person){
        personService.savePerson(person);
        return "success";
    }
}
