package com.todo.todoapp;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
    // what components does a task object need?
    private String name;
    private boolean completed;
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime dueDate;


    public Task(String name, boolean completed, long id, LocalDateTime createdAt, LocalDateTime dueDate) {
        this.name = name;
        this.completed = completed;
        this.id = id;
        this.createdAt = createdAt;
        this.dueDate = dueDate;
    }

    // getters for sorting or display
    public String getName() {
        return name;
    }
    public boolean getStatus() {
        return completed;
    }
    public Long getId() {
        return id;
    }
    public LocalDateTime getCreationDate() {
        return createdAt;
    }
    public LocalDateTime getDueDate() {
        return dueDate;
    }


    // setters for editing 
    public void setName(String name) {
        this.name = name;
    }
    public void setStatus(boolean completed) {
        this.completed = completed;
    }
    public void markComplete() {
        this.completed = true;
    } 
    public void setId(Long id) {
        this.id = id;
    }
    public void setCreationDate(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nStatus: " + completed + "\nID: " + id + "\nDate Created: " + createdAt + "\nDue Date: " + dueDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Task other) {
            return this.id == other.id || this.createdAt.equals(other.createdAt);
        }
        return false;
    }
}
