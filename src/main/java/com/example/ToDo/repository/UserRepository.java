package com.example.ToDoList.repository;

import com.example.ToDoList.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User,Long> {
    List<User> findByFullName(String fullName);
}
