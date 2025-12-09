package com.pluralsight.SakilaSpringBoot.ui;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInterface implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running User Interface");
    }
}
