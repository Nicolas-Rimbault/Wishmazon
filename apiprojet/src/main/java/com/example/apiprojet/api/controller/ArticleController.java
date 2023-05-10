package com.example.apiprojet.api.controller;

import com.example.apiprojet.api.model.Article;
import com.example.apiprojet.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.mapping.InsertOnlyProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ArticleController {

    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article")
    public Article getArticle(@RequestParam Integer id) {
        Optional article = articleService.getArticle(id);
        if (article.isPresent()) {
            return (Article) article.get();
        }
        return null;
    }
    @GetMapping("/articles")
    public List<Article> getArticles() {
        return articleService.getArticles();
    }


}
