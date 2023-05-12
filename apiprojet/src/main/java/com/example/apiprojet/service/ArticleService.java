package com.example.apiprojet.service;

import com.example.apiprojet.api.controller.Dbconnect;
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

         Dbconnect dbconnect = new Dbconnect("jdbc:mariadb://localhost:3307/projet","root","");
            try {
                ResultSet resultSet = dbconnect.getStatement().executeQuery("SELECT * FROM article");
                while (resultSet.next()) {
                    articleslist.add(new Article(resultSet.getInt("Article_ID"), resultSet.getString("Libelle"), resultSet.getString("Prix"), resultSet.getString("Description"), resultSet.getString("Categorie"), resultSet.getString("Disponibilite"), resultSet.getString("Poid"), resultSet.getString("Longueur"), resultSet.getString("Largeur"), resultSet.getString("Hauteur")));
                }
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
