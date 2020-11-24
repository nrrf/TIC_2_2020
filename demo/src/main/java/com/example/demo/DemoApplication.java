package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        new Ventana().setVisible(true);
    }
    public static void ServerSpring(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
