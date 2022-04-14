package com.example.ToDoList.controller;

import com.example.ToDoList.models.Task;
import com.example.ToDoList.models.User;
import com.example.ToDoList.repository.TaskRepository;
import com.example.ToDoList.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("assign")
public class AssignController {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    UserRepository userRepository;


    // assign user to task
    @PutMapping("/users/{userId}/tasks/{taskId}")
    public Task assignUserToTask(@PathVariable Long userId, @PathVariable Long taskId) {
        User user = userRepository.findById(userId).get();
        Task task = taskRepository.findById(taskId).get();
        task.setUser(user);
        return taskRepository.save(task);
    }
}

