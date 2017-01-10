package com.example.impl;

import com.example.api.SimpleService;
/**
 * Implementation of the SimpleService API.
 * 
 */
public class SimpleServiceImpl implements SimpleService {

    public String getString() {
        return "Simple Declarative Service implementation at your service !";
    }
}
