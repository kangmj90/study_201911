package com.example.member.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "member.id", column = @Column(name = "creator_id")),
        @AttributeOverride(name = "member.name", column = @Column(name = "creator_name")),
        @AttributeOverride(name = "date", column = @Column(name = "create_date"))
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter(AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class Created {
    @Embedded
    private EmbeddedMember member;

    private Date date;
}
