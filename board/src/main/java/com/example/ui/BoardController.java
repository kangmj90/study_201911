package com.example.ui;

import com.example.application.BoardService;
import com.example.application.dto.BoardDto;
import com.example.entity.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kangminjeong
 * @since 2019. 11. 30.
 */
@RestController("FrontBoardController")
@RequestMapping(value = "/board")
@Slf4j
public class BoardController {
    @Autowired
    private BoardService service;

    @GetMapping
    public ResponseEntity<List<Board>> list() {
        final List<Board> list = service.list();
        return ResponseEntity.ok(list);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Board> register(@RequestBody BoardDto dto) {
        return ResponseEntity.ok(service.register(dto));
    }
}
