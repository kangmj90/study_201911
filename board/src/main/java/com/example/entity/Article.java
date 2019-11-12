package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author kangminjeong
 * @since 2019. 11. 12.
 */
@Data
@AllArgsConstructor
public class Article {
    private Long id;
    private String title;
    private String content;
    private Long board_id;
    private Long user_id;
}
