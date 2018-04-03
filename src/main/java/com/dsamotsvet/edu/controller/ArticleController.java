package com.dsamotsvet.edu.controller;

import com.dsamotsvet.edu.entity.Article;
import com.dsamotsvet.edu.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ArticleController {

    @Autowired
    private MyService articleService;


    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer id) {
        Article article = articleService.getArticleById(id);
        return new ResponseEntity<>(article, HttpStatus.OK);
    }
    @RequestMapping(value = "articles", method = RequestMethod.GET)
    public ResponseEntity<List<Article>> getAllArticles() {
        return new ResponseEntity<>(articleService.getAllArticles(), HttpStatus.OK);
    }

    @RequestMapping(value = "add-article", method = RequestMethod.POST)
    public ResponseEntity<?> addArticle(@RequestParam(value = "title", required = true) String title,
                                        @RequestParam(value = "category", required = true) String category) {

        return new ResponseEntity<>(articleService.addArticle(new Article(title, category)), HttpStatus.OK);
    }


    @RequestMapping(value = "delete-article/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteArticle(@PathVariable("id") Integer id) {
        articleService.deleteArticle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
