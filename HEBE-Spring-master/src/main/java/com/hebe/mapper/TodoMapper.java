package com.hebe.mapper;

import com.hebe.vo.TodoDTO;
import com.hebe.vo.TodoDTOList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {

    // 접속유저의 todolist 조회
    List<TodoDTO> selTodoList(TodoDTOList param);

    // 접속유저의 todoList 작성
    void insTodoList(TodoDTO param);

    // 접속유저의 todoList 삭제
    void delTodoList(TodoDTO param);

}