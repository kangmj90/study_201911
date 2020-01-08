package com.emcast.board.article.application;

import com.emcast.board.article.application.dto.ArticleCommentWriteReq;
import com.emcast.board.article.application.dto.ArticleFetchReq;
import com.emcast.board.article.application.dto.ArticleWriteReq;
import com.emcast.board.article.model.Article;

public interface ArticleService {
    Article fetch(String boardId, Long articleId, ArticleFetchReq req);

    // 저장
    Article write(String boardId, ArticleWriteReq req);

    void writeComment(String boardId, Long articleId, ArticleCommentWriteReq req);

    Long alertNewComment(String boardId, Long memberId);
}
