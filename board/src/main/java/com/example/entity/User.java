package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author kangminjeong
 * @since 2019. 11. 12.
 */
@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
}
