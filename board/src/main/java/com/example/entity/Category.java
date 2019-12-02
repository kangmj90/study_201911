package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author kangminjeong
 * @since 2019. 12. 1.
 */
@Entity
public class Category {
    @Id
    private Long id;
    private String name;
}
