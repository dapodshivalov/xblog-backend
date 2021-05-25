package ru.podshivalov.xblog.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.podshivalov.xblog.entities.Task;
import ru.podshivalov.xblog.repositories.TaskRepository;

/**
 * @author dapodshivalov
 */
@RestController("localhost:8000")
public class TodoController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello";
    }

    @GetMapping("/gen")
    public void generateTask() {
        Task task = new Task();
        task.setTitle("Soms");
        task.setText("Somssoms");
        task.setDate(LocalDate.now());
        taskRepository.save(task);
    }

    @GetMapping("/getAll")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
