package com.emcast.board.board.model;

import com.emcast.board.article.model.AlertedArticle;
import com.emcast.board.article.model.Article;
import com.emcast.board.article.model.NormalArticle;

public enum ArticleType {
    NORMAL {
        @Override
        public Article newInstance() {
            return new NormalArticle();
        }
    }, ALERT {
        @Override
        public Article newInstance() {
            return new AlertedArticle();
        }
    };

    public abstract Article newInstance();
}
