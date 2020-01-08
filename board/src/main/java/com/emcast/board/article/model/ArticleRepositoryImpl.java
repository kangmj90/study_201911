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
        return from(ARTICLE)
            .leftJoin(ARTICLE.board, BOARD)
            .where(BOARD.id.eq(boardId))
            .fetch();
    }

    @Override
    public PersonalCounting counting(final Long id) {
        return from(MEMBER)
            .where(MEMBER.id.eq(id))
            .select(Projections.constructor(
                PersonalCounting.class,
                JPAExpressions.select(LIKES.count()).from(LIKES).where(LIKES.member.eq(MEMBER)),
                JPAExpressions.select(BOOKMARK.count()).from(BOOKMARK).where(BOOKMARK.member.eq(MEMBER))
            ))
            .fetchFirst();
    }

    @Override
    public List<Article> fetch(final ArticleFetchReq fetch) {
        final JPQLQuery<Article> query = from(ARTICLE);

        if (ArticleFetchReq.FetchType.SUBJECT.equals(fetch.getType())) {
            query.where(ARTICLE.subject.containsIgnoreCase(fetch.getText()));
        } else if (ArticleFetchReq.FetchType.SUBJECT_BODY.equals(fetch.getType())) {
            query.where(
                ARTICLE.subject.containsIgnoreCase(fetch.getText())
                    .or(ARTICLE.body.containsIgnoreCase(fetch.getText()))
            );
        }

        return query.fetch();
    }
}
