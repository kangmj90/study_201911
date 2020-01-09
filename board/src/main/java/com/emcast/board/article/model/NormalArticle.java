package com.emcast.board.article.model;


import com.emcast.member.model.Member;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("NORMAL")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class NormalArticle extends Article {
    @Override
    public void comment(final Member member, final String comment) {
//        TODO: 구현
    }
}
