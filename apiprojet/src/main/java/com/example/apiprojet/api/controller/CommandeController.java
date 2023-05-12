package com.example.apiprojet.api.controller;
import com.example.apiprojet.api.model.Article;
import com.example.apiprojet.api.model.Commande;
import com.example.apiprojet.service.ArticleService;
import com.example.apiprojet.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.mapping.InsertOnlyProperty;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class CommandeController {
    private final CommandeService CommandeService;
    private CommandeService commandeService;

    @Autowired
    public CommandeController(CommandeService commandeService) {
        this.CommandeService = commandeService;
    }

    @GetMapping("/commande")
    public List<Commande> getCommandes() {
        return CommandeService.getCommandes();
    }
    @PostMapping("/newcommande")
    public void addCommande(@RequestParam String Num_commande, @RequestParam String Date, @RequestParam String Statut) {
        Dbconnect dbconnect = new Dbconnect("jdbc:mariadb://localhost:3307/projet","root","");
        try {
            dbconnect.getStatement().executeUpdate("INSERT INTO commandes (Num_commande, Date, Statut) VALUES ('"+Num_commande+"','"+Date+"','"+Statut+"')");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @PutMapping("/updatecommande")
    public void updateCommande(@RequestParam String Num_commande,@RequestParam String Statut) {
        Dbconnect dbconnect = new Dbconnect("jdbc:mariadb://localhost:3307/projet","root","");
        try {
            dbconnect.getStatement().executeUpdate("UPDATE commandes SET Statut = '"+Statut+"' WHERE Num_commande = '"+Num_commande+"'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



