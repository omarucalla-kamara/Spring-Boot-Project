package com.callatodo.TodoListManager.Todo.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.PriorityQueue;

@Entity
public class TodoTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String description;
    private LocalDate deadline;
    private PriorityQueue priority;
    private boolean isCompleted;
    private String categories;

    @ManyToOne
    private TodoTasks todoTasks;
    public TodoTasks(long id, String name, String description,
                     LocalDate deadline, PriorityQueue priority,
                     boolean isCompleted, String categories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.isCompleted = isCompleted;
        this.categories = categories;
    }
    public TodoTasks(String name, String description, LocalDate deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public PriorityQueue getPriority() {
        return priority;
    }

    public void setPriority(PriorityQueue priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "TodoTasks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                ", isCompleted=" + isCompleted +
                ", categories='" + categories + '\'' +
                '}';
    }
}
