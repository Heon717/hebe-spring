package com.hebe.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class TodoDTO {
    private int t_board;
    private String t_text;
    private boolean done;
    private String regdt;
}
