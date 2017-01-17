package com.hust.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hust.springboot.dao.People;

@EnableAutoConfiguration
@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping("/{id}")
    public People getPeople(@PathVariable Integer id) {
        People people = new People();
        people.setId(id);
        people.setAge("20");
        people.setName("yexx");
        return people;
    }
}
