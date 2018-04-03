package com.dsamotsvet.edu.repository;


import com.dsamotsvet.edu.entity.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootConfiguration
public class ArticleRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ArticleRepository repository;

    @Test
    public void testFindByLastName() {
        Article article = new Article("Test title", "C#");

        repository.save(article);

        Article returnArticle = repository.findByTitle(article.getTitle()).orElse(null);

        Assert.assertNotNull(returnArticle);
        System.out.println(returnArticle.toString());

    }
}
