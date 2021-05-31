package com.example.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
private static final Logger logger = LoggerFactory.getLogger(Hello.class);
    private String name;

    public Hello() {}

    public Hello(String name) {
        this.name = name;
        logger.info("name --->"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
