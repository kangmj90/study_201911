package com.example.ui;

import com.example.entity.Article;
import com.example.entity.Board;
import com.example.entity.Comment;
import com.example.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangminjeong
 * @since 2019. 11. 11.
 */
public class Test {
    public static void main(String[] args) {
        List<Board> boards = new ArrayList<>();
        boards.add(new Board(1L, "board1"));
        boards.add(new Board(2L, "board2"));
        boards.add(new Board(3L, "board3"));

        System.out.println("boards = " + boards);

        List<User> users = new ArrayList<>();
        users.add(new User(1L, "name1"));
        users.add(new User(2L, "name2"));

        System.out.println("users = " + users);

        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1L, "subject1", "memo1", 1L, 1L));
        articles.add(new Article(2L, "subject2", "memo2", 2L, 2L));
        articles.add(new Article(3L, "subject3", "memo3", 3L, 2L));

        System.out.println("articles = " + articles);

        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1L, "contents1", 1L, 2L));
        comments.add(new Comment(2L, "contents2", 2L, 2L));

        System.out.println("comments = " + comments);

    }
}
