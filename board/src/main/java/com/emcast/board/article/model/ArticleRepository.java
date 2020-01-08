package com.emcast.board.article.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleCustomRepository {
    Optional<Article> findByBoardIdAndId(String boardId, Long id);
}
