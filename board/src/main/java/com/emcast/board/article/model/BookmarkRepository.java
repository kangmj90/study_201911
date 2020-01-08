package com.emcast.board.article.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, ArticleMarkerId> {
    List<Bookmark> findByMemberId(Long memberId);
}
