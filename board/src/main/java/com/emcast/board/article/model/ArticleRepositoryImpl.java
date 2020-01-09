package com.emcast.board.article.model;

import com.emcast.board.article.application.dto.ArticleFetchReq;
import com.emcast.board.board.model.QBoard;
import com.emcast.member.model.QMember;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

// TODO: 구현
@Repository
public class ArticleRepositoryImpl extends QuerydslRepositorySupport implements ArticleCustomRepository {
    private static final QArticle ARTICLE = QArticle.article;
    private static final QBoard BOARD = QBoard.board;

    private static final QMember MEMBER = QMember.member;
    private static final QLikes LIKES = QLikes.likes;
    private static final QBookmark BOOKMARK = QBookmark.bookmark;

    public ArticleRepositoryImpl() {
        super(Article.class);
    }

    @Override
    public List<Article> findInBoard(final String boardId) {
        return null;
    }

    @Override
    public PersonalCounting counting(final Long id) {
        return null;
    }

    @Override
    public List<Article> fetch(final ArticleFetchReq fetch) {
        return null;
    }
}
