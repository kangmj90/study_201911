package com.emcast.board.article.model;

import com.emcast.member.model.Member;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@IdClass(ArticleMarkerId.class)
@Data
@EqualsAndHashCode(of = {"article", "member"})
public abstract class ArticleMarker {
    @Id
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Id
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    private Date created;
}