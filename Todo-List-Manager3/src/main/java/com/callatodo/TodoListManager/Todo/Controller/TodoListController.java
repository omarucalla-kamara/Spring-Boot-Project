package com.callatodo.TodoListManager.Todo.Controller;


import com.callatodo.TodoListManager.Todo.Service.TodoListService;
import com.callatodo.TodoListManager.Todo.Model.TodoTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoListController {

    private TodoListService todoListService;

    @Autowired
    public TodoListController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping("/todotasks")
    public List<TodoTasks> todoTasks() {
        return todoListService.todoTasks();
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<TodoTasks>> getAllTodoTasks(){
        return ResponseEntity.ok(todoListService.getAllTasks());
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<TodoTasks> getTasksById(@PathVariable Long id) {
        TodoTasks todoTasks = todoListService.getTodoTasksById(id);
        if (todoTasks == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(todoTasks);
    }
}
