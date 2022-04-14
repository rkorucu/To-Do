package com.example.ToDoList.controller;
import com.example.ToDoList.models.Task;
import com.example.ToDoList.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

  @RestController
  @RequestMapping(value = "/tasks")
    public class TaskController {
    @Autowired
    TaskService taskService;


    // get all Task from database
   @GetMapping
    public List<Task> getAllTasks(){
     return taskService.getAllTasks();
 }
      /**
       *--->> get all task from database
       *title:
       * status:
       * localDate:
       * user:
       */
   @PostMapping
    public void addNewTasks(@RequestBody Task task){
     taskService.addNewTask(task);
  }
      /**
       * delete task with task id
       * Deleting task from database is done with taskId
       *
       * @param taskId
       */
     @DeleteMapping("/{taskId}")
     public void deleteTaskById(@PathVariable Long taskId){
         taskService.deleteTaskById(taskId);
  }
  /**
   *complete task status .
   */
    @PutMapping("/{taskId}")
    public void completeTask(@PathVariable Long taskId){
      taskService.completeTask(taskId);
  }

      /**
       * update task info .
       * @param task
       * @return
       */
   @PutMapping("/task")
    public Task updateInfoTask(@RequestBody Task task){
      return taskService.updateInfoTask(task);
    }

  }


