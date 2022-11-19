package com.icolak.bootstrap;

import com.github.javafaker.Faker;
import com.icolak.model.Profile;

import java.time.LocalDateTime;

public class DataGenerator {

    public static Profile createProfile() {
        return new Profile(new Faker().name().firstName(), new Faker().name().lastName(),
                new Faker().name().username(), new Faker().phoneNumber().phoneNumber(),
                new Faker().internet().emailAddress(), LocalDateTime.now());
    }
}
