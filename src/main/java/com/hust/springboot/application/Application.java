package com.hust.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hust.springboot.controller.HelloController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
