package com.example.interceptormiddleware1.service;

import org.springframework.stereotype.Service;

@Service
public class LegacyService {

    public String legacy() {
        return "This is just old code";
    }

}
