package com.example.board.board.application;

import com.example.board.board.application.dto.BoardRegisterReq;
import com.example.board.board.model.Board;

public interface BoardService {
    Board register(BoardRegisterReq req);
}
