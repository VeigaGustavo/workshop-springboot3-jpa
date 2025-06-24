package com.estudandoWeb.course.repositories;

import com.estudandoWeb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
