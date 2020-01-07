package com.example.board.board.application.dto;

import com.example.board.board.model.Board;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardRegisterRes {
    private String id;

    public BoardRegisterRes(Board board) {
        if (board != null) {
            this.id = board.getId();
        }
    }
}
