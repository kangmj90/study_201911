package com.emcast.board.board.application;

import com.emcast.board.board.application.dto.BoardRegisterReq;
import com.emcast.board.board.model.Board;

public interface BoardService {
    Board register(BoardRegisterReq req);
}
