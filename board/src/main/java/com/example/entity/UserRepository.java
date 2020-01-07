package com.example.entity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kangminjeong
 * @since 2019. 12. 18.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
