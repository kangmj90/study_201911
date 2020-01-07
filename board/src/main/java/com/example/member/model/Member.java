package com.example.member.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "member")
@Data
@EqualsAndHashCode(of = "id")
@ToString
public class Member {
    @Id
    private Long id;

    @Column(length = 100)
    private String name;

    @Embedded
    private Address address;

    @Embedded
    private Phone phone;
}