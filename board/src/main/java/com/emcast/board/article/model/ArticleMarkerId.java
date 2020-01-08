package com.emcast.board.article.model;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter(AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class ArticleMarkerId implements Serializable {
    private Long member;

    private Long article;
}
