package com.emcast.board.article.ui.web;

import com.emcast.board.article.application.ArticleService;
import com.emcast.board.article.application.dto.*;
import com.emcast.board.article.model.Article;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board/{boardId}")
@Log4j2
public class ArticleController {
    private final ArticleService service;

    @Autowired
    public ArticleController(final ArticleService service) {
        this.service = service;
    }

    @GetMapping(value = "/article/{articleId}")
    public ArticleFetchRes fetch(final @PathVariable String boardId,
                                 final @PathVariable Long articleId,
                                 final ArticleFetchReq req) {
        log.debug("Article Fetch Request(board: {}, article: {}, req: {})", boardId, articleId, req);

        final Article article = service.fetch(boardId, articleId, req);

        return new ArticleFetchRes(article);
    }

    @PostMapping(value = "/article")
    public ArticleWriteRes write(final @PathVariable String boardId,
                                 final @RequestBody ArticleWriteReq req) {
        log.debug("Article Register Request(board: {}, req: {})", boardId, req);

        final Article article = service.write(boardId, req);

        return new ArticleWriteRes(article);
    }

    @PostMapping(value = "/article/{articleId}/comment")
    public void writeComment(final @PathVariable String boardId,
                             final @PathVariable Long articleId,
                             final @RequestBody ArticleCommentWriteReq req) {
        log.debug("Article Comment Write Request(board: {}, article: {}, req: {})", boardId, articleId, req);

        service.writeComment(boardId, articleId, req);
    }
}
