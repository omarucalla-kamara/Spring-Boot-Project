package com.callatodo.TodoListManager.Todo.Service;

import com.callatodo.TodoListManager.Todo.Repository.TodoListRepository;
import com.callatodo.TodoListManager.Todo.Model.TodoTasks;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoListService {

    private TodoListRepository todoListRepository;
    public List<TodoTasks> todoTasks() {
        return Arrays.asList(
                new TodoTasks("Assignment", "Incomplete Job", LocalDate.now().plusDays(2)),
                new TodoTasks("Meeting", "Discuss Progress and project", LocalDate.now().plusDays(1))
        );
    }

    public List<TodoTasks> getAllTasks() {
        return todoListRepository.findAll();
    }

    public TodoTasks getTodoTasksById(Long id) {
        return todoListRepository.findById(id).orElse(null);
    }
}
