package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/parking")
public class Controller {

    @GetMapping("/getFreeSlots")
    public ResponseEntity getSlots()
    {
        //return null;
        System.out.println("Welcome");
        return ResponseEntity.ok().body("Welcome");

    }


}
