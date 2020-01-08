package com.emcast.board.article.model;

import com.emcast.board.article.application.dto.ArticleFetchReq;

import java.util.List;

public interface ArticleCustomRepository {
    List<Article> findInBoard(String boardId);

    PersonalCounting counting(Long id);

    List<Article> fetch(ArticleFetchReq fetch);
}