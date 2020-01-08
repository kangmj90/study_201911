package com.emcast.board.board.model;

import com.emcast.member.model.Changed;
import com.emcast.member.model.Created;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "board")
@Data
@EqualsAndHashCode(of = "id")
@ToString
public class Board {
    @Id
    private String id;

    @Column(length = 100)
    private String name;

    @Column(length = 255)
    private String description;

    private ArticleType articleType;

    @Embedded
    private Created created;

    @Embedded
    private Changed changed;
}
