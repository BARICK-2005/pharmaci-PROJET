package org.example;

public class Comprime extends Medicament {
    private int dosageMg;
    private int nombreComprimes;
    private String forme;
    private String cibles;
    private boolean generique;

    public Comprime(String nomCommercial, String code, double prix, java.time.LocalDate dateExpiration,
                    int stock, String laboratoire, String categorie,
                    int dosageMg, int nombreComprimes, String forme, String cibles, boolean generique) {
        super(nomCommercial, code, prix, dateExpiration, stock, laboratoire, categorie);
        this.dosageMg = dosageMg;
        this.nombreComprimes = nombreComprimes;
        this.forme = forme;
        this.cibles = cibles;
        this.generique = generique;
    }

    // Getters & Setters
    public int getDosageMg() { return dosageMg; }
    public void setDosageMg(int dosageMg) { this.dosageMg = dosageMg; }

    public int getNombreComprimes() { return nombreComprimes; }
    public void setNombreComprimes(int nombreComprimes) { this.nombreComprimes = nombreComprimes; }

    public String getForme() { return forme; }
    public void setForme(String forme) { this.forme = forme; }

    public String getCibles() { return cibles; }
    public void setCibles(String cibles) { this.cibles = cibles; }

    public boolean isGenerique() { return generique; }
    public void setGenerique(boolean generique) { this.generique = generique; }
}




package pharmacie;

