package com.example.interceptormiddleware1.controller;

import com.example.interceptormiddleware1.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping
    public ResponseEntity<String> getCurrentDateTime() {
        return ResponseEntity.ok().body(basicService.getCurrentDateTime());
    }

}
