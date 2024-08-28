package com.northcoders.demospringbootapp.controller;

import com.northcoders.demospringbootapp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")

public class PersonController {

    @GetMapping("/person")
    public Person getPerson(){
       return new Person("X", 30, "x@x.com","arcane","momo");

    }

}
