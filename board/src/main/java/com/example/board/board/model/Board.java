package com.example.board.board.model;

import com.example.member.model.Changed;
import com.example.member.model.Created;
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

    @Embedded
    private Created created;

    @Embedded
    private Changed changed;
}
