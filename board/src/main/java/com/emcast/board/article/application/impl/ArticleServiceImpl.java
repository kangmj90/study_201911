package com.emcast.board.article.application.impl;

import com.emcast.board.article.application.ArticleService;
import com.emcast.board.article.application.dto.ArticleCommentWriteReq;
import com.emcast.board.article.application.dto.ArticleFetchReq;
import com.emcast.board.article.application.dto.ArticleWriteReq;
import com.emcast.board.article.model.Article;
import com.emcast.board.article.model.ArticleRepository;
import com.emcast.board.article.model.Comments;
import com.emcast.board.board.model.ArticleType;
import com.emcast.board.board.model.Board;
import com.emcast.board.board.model.BoardRepository;
import com.emcast.member.model.Created;
import com.emcast.member.model.EmbeddedMember;
import com.emcast.member.model.Member;
import com.emcast.member.model.MemberRepository;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    private final BoardRepository boardRepository;

    private final ArticleRepository repository;

    private final MemberRepository memberRepository;

    @Autowired
    public ArticleServiceImpl(final BoardRepository boardRepository,
                              final ArticleRepository repository, MemberRepository memberRepository) {
        this.boardRepository = boardRepository;
        this.repository = repository;
        this.memberRepository = memberRepository;
    }


    @Override
    public Article fetch(final String boardId, final Long articleId, final ArticleFetchReq req) {
        // TODO: 구현
        return null;
    }

    @Override
    public Article write(final String boardId, final ArticleWriteReq req) {
        // TODO: 구현
//        2. 게시글 등록
        return null;
    }

    @Override
    public void writeComment(final String boardId, final Long articleId, final ArticleCommentWriteReq req) {
        // TODO: 구현
//        3. 게시글 코멘트를 등록
//                - 코멘트 등록시에 게시글과 코멘트 작성자가 다를 경우 게시글 작성자에게 알람 기능.
    }

    @Override
    public Long alertNewComment(String boardId, Long memberId) {
        // TODO: 구현
//        4. 게시글 상세 정보를 조회하면, 해당 게시글에 대한 알람 삭제
        return null;
    }
}
