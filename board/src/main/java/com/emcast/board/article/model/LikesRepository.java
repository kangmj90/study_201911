package com.emcast.board.article.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, ArticleMarkerId> {
}
