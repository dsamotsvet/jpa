package com.dsamotsvet.edu.service;

import com.dsamotsvet.edu.entity.Article;

import java.util.List;

public interface MyService {
    List<Article> getAllArticles();
    Article getArticleById(long articleId);
    boolean addArticle(Article article);
    void deleteArticle(int articleId);
}
