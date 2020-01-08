package com.emcast.board.board.application.impl;

import com.emcast.board.board.application.BoardService;
import com.emcast.board.board.application.dto.BoardRegisterReq;
import com.emcast.board.board.model.Board;
import com.emcast.board.board.model.BoardRepository;
import com.emcast.member.model.*;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository repository;

    @Autowired
    MemberRepository memberRepository;


    @Override
    public Board register(BoardRegisterReq req) {
        // TODO: 구현
//        1. 게시판 등록
        Board board = new Board();
        board.setId(req.getId());
        board.setName(req.getName());
        board.setDescription(req.getDescription());
        board.setArticleType(req.getArticleType());

        Member member = memberRepository.getOne(req.getMemberId());
        EmbeddedMember embeddedMember = new EmbeddedMember(
                member.getId(), member.getName()
        );

        board.setCreated(new Created(
                embeddedMember, LocalDate.now().toDate()
        ));
        board.setChanged(new Changed(
                embeddedMember, LocalDate.now().toDate()
        ));

        return repository.save(board);
    }
}
