package com.aws.tasktracker.service;

import com.aws.tasktracker.model.Task;
import com.aws.tasktracker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Updates the attachment URL for a given task.
     * @param taskId   The ID of the task
     * @param fileUrl  The S3 file URL, or null to remove the attachment
     */
    public void updateTaskAttachmentUrl(Long taskId, String fileUrl) {
        Optional<Task> taskOpt = taskRepository.findById(taskId);
        if (taskOpt.isPresent()) {
            Task task = taskOpt.get();
            task.setAttachmentUrl(fileUrl); // You'll need an attachmentUrl field in Task
            taskRepository.save(task);
        } else {
            throw new RuntimeException("Task with ID " + taskId + " not found");
        }
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> getTaskById(Long taskId) {
        return taskRepository.findById(taskId);
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}
