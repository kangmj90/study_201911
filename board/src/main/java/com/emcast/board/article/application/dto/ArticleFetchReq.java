package com.emcast.board.article.application.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ArticleFetchReq {
    private FetchType type;

    private String text;

    private Long memberId;

    public enum FetchType {
        MEMBER, SUBJECT, SUBJECT_BODY, MEMBER_SUBJECT;
    }
}
