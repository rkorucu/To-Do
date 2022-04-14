package com.example.ToDoList.controller;
import com.example.ToDoList.models.User;
import com.example.ToDoList.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    UserService userService;


  // get all user from database
  @GetMapping
   public List<User> getAllUsers(){
    return userService.getAllUsers();
}
    // get all task by userName.Only seen by user
    @GetMapping("/{fullName}")
    public List<User> getAllTaskByUserName(@PathVariable String fullName){
        return userService.getAllTaskByUserName(fullName);
    }
// add new User
    @PostMapping
    public void addNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    }

