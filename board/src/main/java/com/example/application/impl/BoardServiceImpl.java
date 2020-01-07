package com.example.application.impl;

import com.example.application.BoardService;
import com.example.application.dto.BoardDto;
import com.example.entity.Board;
import com.example.entity.BoardRepository;
import com.example.entity.User;
import com.example.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kangminjeong
 * @since 2019. 11. 30.
 */
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Board> list() {
        return repository.findAll();
    }

    @Override
    public Board register(BoardDto dto) {

        final User user = userRepository.findById(dto.getUserId()).orElseThrow(RuntimeException::new);

        final Board board = new Board(dto.getName(), user);

        return repository.save(board);
    }
}
