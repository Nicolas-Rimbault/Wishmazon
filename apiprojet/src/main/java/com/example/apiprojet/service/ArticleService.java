package com.example.apiprojet.service;

import com.example.apiprojet.api.model.Article;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    private List<Article> articleslist;

    public ArticleService(){
        articleslist = new ArrayList<>();
        String url = "jdbc:mariadb://localhost:3307/projet";
        String username = "root";
        String password = "";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM article");

            while (resultSet.next()){
                Article article = new Article(
                        resultSet.getInt("Article_ID"),
                        resultSet.getString("libelle"),
                        resultSet.getString("prix"),
                        resultSet.getString("description"),
                        resultSet.getString("categorie"),
                        resultSet.getString("poid"),
                        resultSet.getString("longueur"),
                        resultSet.getString("largeur"),
                        resultSet.getString("hauteur")
                );
                articleslist.add(article);
            }

            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Optional<Article> getArticle(Integer id) {
        Optional optional = Optional.empty();
        for (Article article : articleslist) {
            if (article.getId() == id) {
                optional = Optional.of(article);
                return optional;
            }
        }
        return optional;
    }

    public List<Article> getArticles() {
        return articleslist;
    }
}
