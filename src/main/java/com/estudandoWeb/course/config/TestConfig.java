package com.estudandoWeb.course.config;


import com.estudandoWeb.course.entities.User;
import com.estudandoWeb.course.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Cristovão", "cristovao@gmail.com", "9999999", "123456");
        User user2 = new User(null, "Gustavo", "gustavo@gmail.com", "8888888", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));

    }
}
