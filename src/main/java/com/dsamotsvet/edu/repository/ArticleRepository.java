package com.dsamotsvet.edu.repository;

import com.dsamotsvet.edu.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long>  {
    Optional<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    Optional<Article> findByTitleAndCategory(String title, String category);
}