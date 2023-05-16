package com.example.apiprojet.api.model;

public class Article {
    private int id;
    private String Libelle;
    private String Description;
    private String Prix;
    private String Catégorie;
    private String Disponibilite;
    private String Poid;
    private String Longueur;
    private String Largeur;

    private String Hauteur;

public Article(int id, String Libelle, String Prix, String Description, String Catégorie, String Disponibilite, String Poid, String Longueur, String Largeur, String Hauteur) {
    this.id = id;
    this.Libelle = Libelle;
    this.Prix = Prix;
    this.Description = Description;
    this.Catégorie = Catégorie;
    this.Disponibilite = Disponibilite;
    this.Poid = Poid;
    this.Longueur = Longueur;
    this.Largeur = Largeur;
    this.Hauteur = Hauteur;

}

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
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

public String getDesciption() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }

public String getCatégorie() {
    return Catégorie;
}
public void setCatégorie(String Catégorie) {
    this.Catégorie = Catégorie;
}

public String getDisponibilite() {
    return Disponibilite;
}
public void setDisponibilite(String Disponibilite) {
    this.Disponibilite = Disponibilite;
}
public String getPoid() {
    return Poid;
}
public void setPoid(String Poid) {
    this.Poid = Poid;
}

public String getLongueur() {
    return Longueur;}
public void setLongueur(String Longueur) {this.Longueur = Longueur;}

public String getLargeur() {return Largeur;}
public void setLargeur(String Largeur) {this.Largeur = Largeur;}

public String getHauteur() {return Hauteur;}
public void setHauteur(String Hauteur) {this.Hauteur = Hauteur;}

}


