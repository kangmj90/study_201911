package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

/**
 * @author kangminjeong
 * @since 2019. 11. 12.
 */
@Data
@AllArgsConstructor
public class Comment {
    private Long id;
    private String content;
    private Long article_id;
    private Long user_id;

    @EmbeddedId
    private InnerId innerId;
}

@Embeddable
 class InnerId {
    private Long article_id;
    private Long user_id;
}
