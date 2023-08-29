package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class Conf {

    @Bean
    public Random getRandom() {
        return new Random(123456);
    }
}