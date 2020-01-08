package com.emcast.member.model;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter(AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class EmbeddedMember {
    private Long id;

    private String name;
}
