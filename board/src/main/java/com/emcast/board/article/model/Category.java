package com.emcast.board.article.model;

import com.emcast.board.board.model.Board;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data
@EqualsAndHashCode(of = "id")
@ToString(exclude = {"board"})
public class Category {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @Column(name = "name", length = 100)
    private String name;
}