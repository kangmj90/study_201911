package com.emcast.board.article.model;

import com.emcast.member.model.Member;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comment_alert")
@Data
@EqualsAndHashCode(of = "id")
@ToString(exclude = {"target", "writer", "article"})
public class CommentAlert {
    @Id
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member target;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer;

    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;

    // 어느시점에 발생한 알람인지
    private String type;

    private Date created;

    private Date read;

    public CommentAlert(final Member member, final Article article, final String type) {
        this.id = String.format("%07d%07d", member.getId(), article.getId());
//        this.member = member;
        this.article = article;
        this.type = type;
        this.created = LocalDateTime.now().toDate();
    }
}
