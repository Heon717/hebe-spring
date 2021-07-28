package com.hebe.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TodoDTO {
    private int t_board;
    private String t_text;
    private boolean done;
    private String regdt;
}
