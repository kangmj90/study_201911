package com.emcast.board.board.ui.web;

import com.emcast.board.board.application.BoardService;
import com.emcast.board.board.application.dto.BoardRegisterReq;
import com.emcast.board.board.application.dto.BoardRegisterRes;
import com.emcast.board.board.model.Board;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(final BoardService service) {
        this.service = service;
    }

    @PostMapping("/board")
    public BoardRegisterRes register(final @RequestBody BoardRegisterReq req) {
        log.debug("Board Register Request(req: {})", req);

        final Board board = service.register(req);

        return new BoardRegisterRes(board);
    }
}
