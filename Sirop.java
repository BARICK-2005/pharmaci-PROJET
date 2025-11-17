package org.example;

public class Sirop extends Medicament {
    private double volumeMl;
    private String gout;
    private String couleur;
    private boolean sucre;
    private double dosageParCuillere;

    public Sirop(String nomCommercial, String code, double prix, java.time.LocalDate dateExpiration,
                 int stock, String laboratoire, String categorie,
                 double volumeMl, String gout, String couleur, boolean sucre, double dosageParCuillere) {
        super(nomCommercial, code, prix, dateExpiration, stock, laboratoire, categorie);
        this.volumeMl = volumeMl;
        this.gout = gout;
        this.couleur = couleur;
        this.sucre = sucre;
        this.dosageParCuillere = dosageParCuillere;
    }

    // Getters & Setters
    public double getVolumeMl() { return volumeMl; }
    public void setVolumeMl(double volumeMl) { this.volumeMl = volumeMl; }

    public String getGout() { return gout; }
    public void setGout(String gout) { this.gout = gout; }

    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    public boolean isSucre() { return sucre; }
    public void setSucre(boolean sucre) { this.sucre = sucre; }

    public double getDosageParCuillere() { return dosageParCuillere; }
    public void setDosageParCuillere(double dosageParCuillere) { this.dosageParCuillere = dosageParCuillere; }
}



package pharmacie;

