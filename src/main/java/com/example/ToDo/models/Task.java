package com.example.ToDoList.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
   @Table(name = "tasks")
  public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;

    @Column(name = "title")
    private String title;
    @Column(name = "status")
    private boolean status;
    private LocalDateTime localDateTime;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_user_id")
    private User user;

    public Task() {
    }

    public Task(Long taskId, String title, boolean status,LocalDateTime localDate) {
        this.taskId = taskId;
        this.title = title;
        this.status = status;
        this.localDateTime =localDate;

    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

}
