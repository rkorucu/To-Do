package com.example.ToDoList.services;
import com.example.ToDoList.models.User;
import com.example.ToDoList.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

  @Service
   public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public List<User> getAllTaskByUserName(String fullName) {
        return userRepository.findByFullName(fullName);
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }


}
