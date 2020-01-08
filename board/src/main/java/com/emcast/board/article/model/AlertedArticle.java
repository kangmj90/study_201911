package com.emcast.board.article.model;


import com.emcast.member.model.Member;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("ALERT")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AlertedArticle extends Article {
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "article", cascade = CascadeType.ALL)
    private List<CommentAlert> alerts;

    @Override
    public void comment(final Member member, final String comment) {
        if (!getWritten().getMember().getId().equals(member.getId())) {
            this.alerts.add(new CommentAlert(member, this, "ADD_COMMENT"));
        }

        final List<Comments> comments = getComments();

        comments.add(new Comments(comment, null));
    }
}
