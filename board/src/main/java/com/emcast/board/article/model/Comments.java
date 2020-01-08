package com.emcast.board.article.model;

import com.emcast.member.model.Created;
import lombok.*;

import javax.persistence.*;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter(AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString
public class Comments {
    private String comment;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "member.id", column = @Column(name = "writer_id")),
            @AttributeOverride(name = "member.name", column = @Column(name = "writer_name")),
            @AttributeOverride(name = "date", column = @Column(name = "write_date"))
    })
    private Created written;
}