package com.emcast.board.article.application.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ArticleWriteReq {
    private String subject;

    private String body;

    private Long writerId;
}
