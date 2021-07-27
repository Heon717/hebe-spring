package com.hebe.controller;

import com.hebe.service.TodoService;
import com.hebe.vo.TodoDTO;
import com.hebe.vo.TodoDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoService TodoService;

    // 접속유저의 todolist 조회
    // RequestBody는 post형식으로 json 받을 때 사용
    @PostMapping("/todo")
    public List<TodoDTO> selTodoList(TodoDTO param) {
        List<TodoDTO> list = TodoService.selTodoList(param);
        System.out.println("contlloer : "+list);
        return list;
    }

    // 접속유저의 todoList 작성
    @PostMapping("/todo/insert")
    public void insTodoList(@RequestBody TodoDTOList param) {
        TodoService.insTodoList(param);
    }

    // 접속유저의 todoList 삭제
    @PostMapping("/todo/delete")
    public void delTodoList(@RequestBody TodoDTOList param) {
        TodoService.delTodoList(param);
    }
}