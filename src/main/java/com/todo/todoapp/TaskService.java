package com.todo.todoapp;

import java.util.ArrayList;

import com.todo.todoapp.exception.TaskNotFoundException;

public class TaskService {
    private final ArrayList<Task> tasks = new ArrayList<>();
    
    public ArrayList<Task> getAllTasks() {
        return tasks;
    }


    public Task getTaskById(Long id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        throw new TaskNotFoundException("Task with ID \"" + id + "\" not found.");
    }

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    public Task deleteTask(Task task) {
        tasks.remove(task);
        return task;
    }

    public Task updateTask(Task updatedData, Long id) {
        Task task = getTaskById(id);
        task.setName(updatedData.getName());
        task.setDueDate(updatedData.getDueDate());
        task.setStatus(updatedData.getStatus());
        return task;
    }
}
