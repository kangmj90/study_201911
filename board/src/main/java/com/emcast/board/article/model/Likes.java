package com.emcast.board.article.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: 구현
@Entity
@Table(name = "article_likes")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Likes extends ArticleMarker {
}
