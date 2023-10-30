package com.demo.mvcexample.rest;

import com.demo.mvcexample.model.Person;
import com.demo.mvcexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonRestController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/all")
    private ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(personRepository.findAll());
    }

    @PostMapping("/create")
    private ResponseEntity<Person> createPerson(Person person) {
        return ResponseEntity.ok(personRepository.save(person));
    }
}
