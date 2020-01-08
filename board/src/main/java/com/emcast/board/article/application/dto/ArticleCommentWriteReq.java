package com.emcast.board.article.application.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ArticleCommentWriteReq {
    private String text;

    private Long writerId;
}
