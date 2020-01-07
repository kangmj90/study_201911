package com.example.member.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter(AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class Address {
    @Column(name = "address_post", length = 10)
    private String post;

    @Column(name = "address_detail", length = 250)
    private String detail;
}
