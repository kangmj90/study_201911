package com.emcast.board.article.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PersonalCounting {
    private Long bookmark;

    private Long like;

    public PersonalCounting(final Long bookmark, final Long like) {
        this.bookmark = bookmark;
        this.like = like;
    }
}
