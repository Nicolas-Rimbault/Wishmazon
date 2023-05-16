package com.example.apiprojet.api.controller;

import com.example.apiprojet.api.model.Facture;
import com.example.apiprojet.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FactureController {
    private FactureService factureService;
;   @Autowired
    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }
    @GetMapping("/factures")
        public List<Facture> getFactures() {
            return factureService.getFactures();
    }

}
