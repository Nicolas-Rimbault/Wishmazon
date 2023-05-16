package com.example.apiprojet.api.model;

public class Commande {
    private int id_commande;
    private String Num_commande;
    private String Date;
    private String Statut;

    public Commande(String Num_commande, String Date, String Statut) {

        this.Num_commande = Num_commande;
        this.Date = Date;
        this.Statut = Statut;
    }

    public String getNum_commande() {
        return Num_commande;
    }
    public void setNum_commande(String Num_commande) {
        this.Num_commande = Num_commande;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String Statut) {
        this.Statut = Statut;
    }



}



