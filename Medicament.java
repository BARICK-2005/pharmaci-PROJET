package org.example;

import java.time.LocalDate;

public class Medicament {
    public static void main(String[] args) {
        Medicament medoc = new Medicament(
                "doliprane", "D123", 5.99,
                LocalDate.of(2026, 5, 15),
                100, "sanofi", "Antalgique"
        );
    System.out.println("Nom commercial : " + medoc.getNomCommercial());


    }
    private String nomCommercial;
    private String code;
    private double prix;
    private LocalDate dateExpiration;
    private int stock;
    private String laboratoire;
    private String categorie;

    // Constructeur
    public Medicament(String nomCommercial, String code, double prix, LocalDate dateExpiration,
                      int stock, String laboratoire, String categorie) {
        this.nomCommercial = nomCommercial;
        this.code = code;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
        this.stock = stock;
        this.laboratoire = laboratoire;
        this.categorie = categorie;
    }

    // Getters & Setters
    public String getNomCommercial() { return nomCommercial; }
    public void setNomCommercial(String nomCommercial) { this.nomCommercial = nomCommercial; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public LocalDate getDateExpiration() { return dateExpiration; }
    public void setDateExpiration(LocalDate dateExpiration) { this.dateExpiration = dateExpiration; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public String getLaboratoire() { return laboratoire; }
    public void setLaboratoire(String laboratoire) { this.laboratoire = laboratoire; }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }

    // Méthodes communes
    public void afficherInfos() {
        System.out.println("Nom: " + nomCommercial + ", Code: " + code + ", Prix: " + prix +
                ", Expiration: " + dateExpiration + ", Stock: " + stock +
                ", Laboratoire: " + laboratoire + ", Catégorie: " + categorie);
    }

    public boolean estExpire() {
        return LocalDate.now().isAfter(dateExpiration);
    }

    public void mettreAJourStock(int quantite) {
        this.stock += quantite;
    }
}





