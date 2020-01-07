package com.example.member.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "member.id", column = @Column(name = "modifier_id")),
        @AttributeOverride(name = "member.name", column = @Column(name = "modifier_name")),
        @AttributeOverride(name = "date", column = @Column(name = "modify_date"))
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter(AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class Changed {
    @Embedded
    private EmbeddedMember member;

    private Date date;
}
