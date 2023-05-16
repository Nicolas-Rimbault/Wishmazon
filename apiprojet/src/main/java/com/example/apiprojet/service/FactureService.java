package com.example.apiprojet.service;

import com.example.apiprojet.api.controller.Dbconnect;
import com.example.apiprojet.api.model.Facture;
import org.springframework.stereotype.Service;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Service
public class FactureService {
    private List<Facture> factures = new ArrayList<Facture>();

    public FactureService() {
        Dbconnect dbconnect = new Dbconnect("jdbc:mariadb://localhost:3307/projet","root","");
        try {

            ResultSet resultSet = dbconnect.getStatement().executeQuery("SELECT f.Num_commande,f.date, c.date, q.Qte, u.nom, u.prenom, u.telephone, r.CP, r.Ville, r.adresse, a.libelle, a.prix FROM facture f, commandes c, qtearticle q, utilisateur u, article a, adresse r WHERE f.Num_commande = c.Num_commande AND c.Num_commande = q.Num_commande AND q.Article_ID= a.Article_ID AND u.id_user= r.id_user AND u.id_user = c.id_user");
            while (resultSet.next()) {
                factures.add(new Facture(resultSet.getString("Num_commande"), resultSet.getString("date"), resultSet.getString("date"), resultSet.getString("Qte"), resultSet.getString("nom"), resultSet.getString("prenom"), resultSet.getString("telephone"), resultSet.getString("CP"), resultSet.getString("Ville"), resultSet.getString("adresse"), resultSet.getString("libelle"), resultSet.getString("prix")));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Facture> getFactures() {
        return factures;
    }
}
