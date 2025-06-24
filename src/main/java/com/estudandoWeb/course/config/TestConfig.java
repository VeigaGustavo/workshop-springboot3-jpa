package com.estudandoWeb.course.config;


import com.estudandoWeb.course.entities.Order;
import com.estudandoWeb.course.entities.User;
import com.estudandoWeb.course.entities.enums.OrderStatus;
import com.estudandoWeb.course.repositories.OrderRepository;
import com.estudandoWeb.course.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Cristovão", "cristovao@gmail.com", "9999999", "123456");
        User user2 = new User(null, "Gustavo", "gustavo@gmail.com", "8888888", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
