package org.example.controller;

import org.example.service.ArticleService;
import org.example.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("hot")
    public Result hotArticles() {
        int limit = 6;
        return articleService.hotArticles(limit);
    }

}
