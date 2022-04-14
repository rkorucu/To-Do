package com.example.ToDoList.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name = "fullName")
    private String fullName;

    @OneToMany(mappedBy = "user")
    private final List<Task> todoList = new ArrayList<>();


    public User() {
    }

    public User(Long userId, String fullName) {
        this.userId = userId;
        this.fullName = fullName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Task> getTodoList() {
        return todoList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", todoList=" + todoList +
                '}';
    }
}


