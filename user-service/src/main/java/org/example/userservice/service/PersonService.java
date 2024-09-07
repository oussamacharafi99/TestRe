package org.example.userservice.service;

import org.example.userservice.model.Person;
import org.example.userservice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    public PersonRepository personRepository;


    public Person findPersonByUsername(String username){
        return personRepository.findByUsername(username);
    }
}
