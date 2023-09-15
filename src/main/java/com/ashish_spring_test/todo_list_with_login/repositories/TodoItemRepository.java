package com.ashish_spring_test.todo_list_with_login.repositories;

import com.ashish_spring_test.todo_list_with_login.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem,Long> {

}
