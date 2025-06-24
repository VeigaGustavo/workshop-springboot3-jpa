package com.estudandoWeb.course.repositories;

import com.estudandoWeb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
