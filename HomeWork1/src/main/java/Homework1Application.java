package com.example.homework_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework1Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework1Application.class, args);
    }
    public final class ImmutablePerson {

        private final String name;

        public ImmutablePerson(String name) {
            this.name = name;

        }

        public String getName() {
            return name;
        }
    }
}
