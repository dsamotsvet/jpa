package com.dsamotsvet.edu.service;

import com.dsamotsvet.edu.entity.Article;
import com.dsamotsvet.edu.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article getArticleById(long articleId) {
        return articleRepository.findOne(articleId);
    }

    @Override
    public List<Article> getAllArticles() {
        List<Article> list = new ArrayList<>();
        articleRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public synchronized boolean addArticle(Article article) {
        articleRepository.save(article);
        return true;
    }

    @Override
    public void deleteArticle(int articleId) {
        articleRepository.delete(getArticleById(articleId));
    }
}
