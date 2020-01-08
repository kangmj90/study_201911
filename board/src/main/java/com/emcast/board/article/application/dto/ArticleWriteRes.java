package com.emcast.board.article.application.dto;

import com.emcast.board.article.model.Article;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class ArticleWriteRes {
    private Long id;

    public ArticleWriteRes(final Article article) {
        this.id = article.getId();
    }
}
