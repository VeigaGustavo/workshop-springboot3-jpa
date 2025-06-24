package com.estudandoWeb.course.repositories;

import com.estudandoWeb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
