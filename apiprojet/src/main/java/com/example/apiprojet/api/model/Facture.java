package com.example.apiprojet.api.model;

public class Facture {

    private String Num_commande;
    private String Datefacture;
    private String Datecommande;

    private String Qte;
    private String Nom;
    private String Prenom;
    private String Telephone;
    private String CP;
    private String Ville;
    private String adresse;
    private String Libelle;
    private String Prix;


    public Facture(String Num_commande, String Datefacture, String Datecommande, String Qte, String Nom, String Prenom, String Telephone, String CP, String Ville, String adresse, String Libelle, String Prix) {
        this.Num_commande = Num_commande;
        this.Datefacture = Datefacture;
        this.Datecommande = Datecommande;
        this.Qte = Qte;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Telephone = Telephone;
        this.CP = CP;
        this.Ville = Ville;
        this.adresse = adresse;
        this.Libelle = Libelle;
        this.Prix = Prix;
    }


    public String getNum_commande() {
        return Num_commande;
    }
    public void setNum_commande(String Num_commande) {
        this.Num_commande = Num_commande;
    }
    public String getDatefacture() {
        return Datefacture;
    }
    public void setDatefacture(String Datefacture) {
        this.Datefacture = Datefacture;
    }
    public String getDatecommande() {
        return Datecommande;
    }
    public void setDatecommande(String Datecommande) {
        this.Datecommande = Datecommande;
    }
    public String getQte() {
        return Qte;
    }
    public void setQte(String Qte) {
        this.Qte = Qte;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    public String getTelephone(String Telephone) {
        return Telephone;
    }
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }
    public String getCP() {
        return CP;
    }
    public void setCP(String CP) {
        this.CP = CP;
    }
    public String getVille() {
        return Ville;
    }
    public void setVille(String Ville) {
        this.Ville = Ville;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLibelle() {
        return Libelle;
    }
    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }
    public String getPrix() {
        return Prix;
    }
    public void setPrix(String Prix) {
        this.Prix = Prix;
    }
    


}
