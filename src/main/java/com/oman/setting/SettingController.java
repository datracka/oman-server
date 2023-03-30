package com.oman.setting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oman.todoitem.TodoItem;

// import com.oman.todoitem.TodoItem;

@RestController
@RequestMapping("setting")
public class SettingController {

    @GetMapping
    public ResponseEntity<TodoItem> getSeettings() {
        return ResponseEntity.ok(new TodoItem());
    }

}
