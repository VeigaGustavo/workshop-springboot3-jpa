package com.estudandoWeb.course.repositories;

import com.estudandoWeb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
