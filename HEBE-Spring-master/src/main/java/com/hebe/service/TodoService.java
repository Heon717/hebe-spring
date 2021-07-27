package com.hebe.service;

import com.hebe.mapper.TodoMapper;
import com.hebe.vo.TodoDTO;
import com.hebe.vo.TodoDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoMapper TodoMapper;

    // 접속유저의 todolist 조회
    public List<TodoDTO> selTodoList(TodoDTO param) {
        return TodoMapper.selTodoList(param);
    }

    // 접속유저의 todoList 작성
    public void insTodoList(TodoDTOList param) {
        TodoMapper.delTodoList(param.getList().get(0
        ));
        for (TodoDTO item : param.getList()) {
            TodoMapper.insTodoList(item);
        }
        System.out.println("insert : " + param);
    }

    // 접속유저의 todoList 삭제
    public void delTodoList(TodoDTOList param) {
        TodoMapper.delTodoList(param.getList().remove(0));
    }
}