package com.aws.tasktracker.repository;

import com.aws.tasktracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
