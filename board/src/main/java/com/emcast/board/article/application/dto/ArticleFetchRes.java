package com.emcast.board.article.application.dto;

import com.emcast.board.article.model.Article;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class ArticleFetchRes {
    private Long id;

    private String subject;

    private String body;

    public ArticleFetchRes(final Article article) {
        this.id = article.getId();
        this.subject = article.getSubject();
        this.body = article.getBody();
    }
}
