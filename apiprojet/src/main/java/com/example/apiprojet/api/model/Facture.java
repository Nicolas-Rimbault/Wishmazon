package com.example.apiprojet.api.model;

public class Facture {

    private String Num_commande;
    private String Datefacture;
    private String Datecommande;
    private String Nom;
    private String Prenom;

    private String Telephone;
    private String Adresse;
    private String Ville;
    private String Code_postal;
    private String Libelle;
    private String Prix;
    private String Qte;

    public Facture(String Num_commande, String Datefacture,String Datecommande, String Nom, String Prenom, String Telephone, String Adresse, String Ville, String Code_postal, String Libelle, String Prix, String Qte) {

        this.Num_commande = Num_commande;
        this.Datefacture = Datefacture;
        this.Datecommande = Datecommande;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Telephone = Telephone;
        this.Adresse = Adresse;
        this.Ville = Ville;
        this.Code_postal = Code_postal;
        this.Libelle = Libelle;
        this.Prix = Prix;
        this.Qte = Qte;
    }

}
