package com.aws.tasktracker.controller;

import com.aws.tasktracker.model.Task;
import com.aws.tasktracker.repository.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {
        Task saved = taskRepository.save(task);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @Valid @RequestBody Task taskDetails) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        if (!taskOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Task task = taskOptional.get();
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted());

        Task updated = taskRepository.save(task);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        if (!taskRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        taskRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
