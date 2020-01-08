package com.emcast.member.model;

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
class Phone {
    @Column(name = "phone_number", length = 30)
    private String number;
}
