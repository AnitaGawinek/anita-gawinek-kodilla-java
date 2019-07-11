package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskList {
    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added.");
    }

    public List<String> getTasks() {
        return tasks;
    }
}
