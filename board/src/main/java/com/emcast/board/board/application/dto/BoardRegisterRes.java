package com.emcast.board.board.application.dto;

import com.emcast.board.board.model.Board;
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
