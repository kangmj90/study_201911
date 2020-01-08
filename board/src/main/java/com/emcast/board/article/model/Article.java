package com.emcast.board.article.model;

import com.emcast.board.board.model.ArticleType;
import com.emcast.board.board.model.Board;
import com.emcast.member.model.Changed;
import com.emcast.member.model.Created;
import com.emcast.member.model.Member;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "article")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
@Data
@EqualsAndHashCode(of = "id")
@ToString(exclude = {"board", "category"})
public abstract class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private String subject;

    private String body;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "article_comments", joinColumns = @JoinColumn(name = "article_id", referencedColumnName = "id"))
    private List<Comments> comments = new ArrayList<>();

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "member.id", column = @Column(name = "writer_id")),
        @AttributeOverride(name = "member.name", column = @Column(name = "writer_name")),
        @AttributeOverride(name = "date", column = @Column(name = "write_date"))
    })
    private Created written;

    @Embedded
    private Changed changed;

    public abstract void comment(final Member member, final String comment);

    public static Article create(final Board board) {
        final ArticleType type = board.getArticleType();
        if (type == null) {
            throw new RuntimeException("Unsupported Article Type!");
        }

        return type.newInstance();
    }
}