package com.example.ToDoList.services;
import com.example.ToDoList.models.Task;
import com.example.ToDoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
 @Autowired
 TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void addNewTask(Task task) {
      taskRepository.save(task).getTaskId();
    }

    public void deleteTaskById(Long taskId) {
        taskRepository.deleteById(taskId);

    }
    public void completeTask(Long taskId) {
        Task task=taskRepository.findById(taskId).get();
        task.setStatus(true);
        taskRepository.save(task);


    }

    public Task updateInfoTask(Task task) {
      return taskRepository.save(task);
    }
}
