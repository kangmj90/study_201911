package com.example.application.impl;

import com.example.application.BoardService;
import com.example.entity.Board;
import com.example.entity.BoardRepository;
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

    @Override
    public List<Board> list() {
        return repository.findAll();
    }
}
