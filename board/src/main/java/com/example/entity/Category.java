package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author kangminjeong
 * @since 2019. 12. 1.
 */
public class Category {
    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Board> boards;
}
