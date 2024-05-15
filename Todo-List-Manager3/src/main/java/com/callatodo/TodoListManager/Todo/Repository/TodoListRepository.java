package com.callatodo.TodoListManager.Todo.Repository;

import com.callatodo.TodoListManager.Todo.Model.TodoTasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoTasks, Long> {

}
