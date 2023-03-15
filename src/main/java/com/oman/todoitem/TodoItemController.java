package com.oman.todoitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/todo-items")
public class TodoItemController {

    @Autowired
    private TodoItemRepo todoItemRepo;

    @GetMapping
    public List<TodoItem> findAll() {
        return todoItemRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@RequestBody TodoItem todoItem) {
        return todoItemRepo.save(todoItem);
    }

}
