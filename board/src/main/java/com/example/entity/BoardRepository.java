package com.example.entity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kangminjeong
 * @since 2019. 12. 1.
 */
public interface BoardRepository extends JpaRepository<Board, Long> {
}
