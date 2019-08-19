package com.example.jpadatarest.service;

import com.example.jpadatarest.hello.Person;
import com.example.jpadatarest.hello.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void savePerson(Person person){
        personRepository.save(person);
    }
}
