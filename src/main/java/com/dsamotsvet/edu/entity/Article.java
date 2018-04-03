package com.dsamotsvet.edu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="articles")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="article_id")
    private Long articleId;

    @Column(name="title")
    private String title;

    @Column(name="category")
    private String category;

    protected Article() {
    }

    public Article(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Long getArticleId() {
        return articleId;
    }
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}