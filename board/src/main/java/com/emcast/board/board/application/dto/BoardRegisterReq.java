package com.emcast.board.board.application.dto;

import com.emcast.board.board.model.ArticleType;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BoardRegisterReq {
    private String id;

    private String name;

    private String description;

    private ArticleType articleType;

    private Long memberId;
}
