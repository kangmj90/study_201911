package com.example.board.board.ui.web;

import com.example.board.board.application.BoardService;
import com.example.board.board.application.dto.BoardRegisterReq;
import com.example.board.board.application.dto.BoardRegisterRes;
import com.example.board.board.model.Board;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/board")
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(final BoardService service) {
        this.service = service;
    }

    @PostMapping
    public BoardRegisterRes register(final @RequestBody BoardRegisterReq req) {
        log.debug("Board Register Request(req: {})", req);

        final Board board = service.register(req);

        return new BoardRegisterRes(board);
    }
}
