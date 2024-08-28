package org.example.taskservice.service;

import org.example.taskservice.model.Task;
import org.example.taskservice.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    public Task save(Task task) {
        return taskRepo.save(task);
    }

    public Task update(Integer id, Task task) {
        Task taskToUpdate = taskRepo.findById(id).orElseThrow();
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setHeurs(task.getHeurs());
        taskToUpdate.setStartDate(task.getStartDate());
        taskToUpdate.setEndDate(task.getEndDate());
        taskToUpdate.setProject_id(task.getProject_id());
        taskToUpdate.setStatus(task.getStatus());

        return taskRepo.save(taskToUpdate);
    }

    public Task findById(Integer id) {
        return taskRepo.findById(id).orElseThrow();
    }

    public List<Task> findAll() {
        return taskRepo.findAll();
    }

    public void deleteById(Integer id) {
        taskRepo.deleteById(id);
    }
}
