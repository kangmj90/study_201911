package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author kangminjeong
 * @since 2019. 11. 12.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Long id;
    private String name;
}
