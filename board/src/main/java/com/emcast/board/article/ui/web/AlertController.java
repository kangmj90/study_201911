package com.emcast.board.article.ui.web;

import com.emcast.board.article.application.ArticleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alert")
@Log4j2
public class AlertController {
    private final ArticleService service;

    @Autowired
    public AlertController(final ArticleService service) {
        this.service = service;
    }

    @GetMapping(value = "/counting/comment/{boardId}")
    public Long fetch(final @PathVariable String boardId,
                      final @RequestParam(value = "memberId") Long memberId) {
        log.debug("Alert New Comment Fetch Request(board: {}, member: {})", boardId, memberId);

        return service.alertNewComment(boardId, memberId);
    }
}
