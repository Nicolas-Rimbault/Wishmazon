package com.example.apiprojet.api.controller;
import com.example.apiprojet.api.model.Article;
import com.example.apiprojet.api.model.Commande;
import com.example.apiprojet.service.ArticleService;
import com.example.apiprojet.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.mapping.InsertOnlyProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
