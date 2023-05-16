package com.example.apiprojet.service;

import com.example.apiprojet.api.controller.Dbconnect;
import com.example.apiprojet.api.model.Article;
import com.example.apiprojet.api.model.Commande;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommandeService {
    private List<Commande> commandeList;
    public CommandeService() {
        commandeList = new ArrayList<>();
        Dbconnect dbconnect = new Dbconnect("jdbc:mariadb://localhost:3307/projet","root","");
        try {
            ResultSet resultSet = dbconnect.getStatement().executeQuery("SELECT * FROM commandes");
            while (resultSet.next()) {
                commandeList.add(new Commande(resultSet.getString("NUM_Commande"), resultSet.getString("Date"), resultSet.getString("Statut")));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }



    }

    public List<Commande> getCommandes() {
        return commandeList;

    }
}
