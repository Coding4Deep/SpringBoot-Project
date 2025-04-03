package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks this as a repository (DAO)
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository provides built-in CRUD methods like save(), findAll(), findById(), delete()
}
