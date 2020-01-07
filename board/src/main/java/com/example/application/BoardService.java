package com.example.application;

import com.example.application.dto.BoardDto;
import com.example.entity.Board;

import java.util.List;

/**
 * @author kangminjeong
 * @since 2019. 11. 30.
 */
public interface BoardService {
    List<Board> list();

    Board register(BoardDto dto);
}
