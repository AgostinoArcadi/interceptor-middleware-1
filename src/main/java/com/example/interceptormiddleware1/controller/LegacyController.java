package com.example.interceptormiddleware1.controller;

import com.example.interceptormiddleware1.service.LegacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @Autowired
    private LegacyService legacyService;

    @GetMapping
    public ResponseEntity<String> legacy() {
        return ResponseEntity.ok().body(legacyService.legacy());
    }
}
