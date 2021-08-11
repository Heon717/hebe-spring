package com.hebe.service;

import com.hebe.mapper.TodoMapper;
import com.hebe.vo.CalendarDTO;
import com.hebe.vo.TodoDTO;
import com.hebe.vo.TodoDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoMapper TodoMapper;

    // 접속유저의 전체 todolist 조회
    public List<TodoDTO> selTodoList(TodoDTO param) {
        return TodoMapper.selTodoList(param);
    }

    // 접속유저의  날짜별 todolist 조회
    public List<TodoDTO> dayTodoList(TodoDTO param) {
        return TodoMapper.dayTodoList(param);
    }

    public List<TodoDTO> calList(TodoDTO param) { return TodoMapper.calList(param);}

    public List<CalendarDTO> monthdata(CalendarDTO param) { return TodoMapper.monthdata(param); }

    // 접속유저의 todoList 작성
    public void insTodoList(TodoDTOList param) {
        if(param.getList().get(0) != null) {
            TodoMapper.delTodoList(param.getList().get(0));
        }
        for (TodoDTO item : param.getList()) {
            TodoMapper.insTodoList(item);
        }
    }

    // 접속유저의 todoList 삭제
    public void delTodoList(TodoDTOList param) {
        TodoMapper.delTodoList(param.getList().remove(0));
    }
}