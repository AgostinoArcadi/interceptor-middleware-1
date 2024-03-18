package com.example.interceptormiddleware1.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BasicService {

    public String getCurrentDateTime() {
        return "Current date and time: " + LocalDateTime.now();
    }
}
