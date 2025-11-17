package org.example;

public class Injection extends Medicament {
    private double volumeDoseMl;
    private String voieAdministration;
    private int nombreDoses;
    private double temperatureConservation;
    private double aiguilleTaille;

    public Injection(String nomCommercial, String code, double prix, java.time.LocalDate dateExpiration,
                     int stock, String laboratoire, String categorie,
                     double volumeDoseMl, String voieAdministration, int nombreDoses,
                     double temperatureConservation, double aiguilleTaille) {
        super(nomCommercial, code, prix, dateExpiration, stock, laboratoire, categorie);
        this.volumeDoseMl = volumeDoseMl;
        this.voieAdministration = voieAdministration;
        this.nombreDoses = nombreDoses;
        this.temperatureConservation = temperatureConservation;
        this.aiguilleTaille = aiguilleTaille;
    }

    // Getters & Setters
    public double getVolumeDoseMl() { return volumeDoseMl; }
    public void setVolumeDoseMl(double volumeDoseMl) { this.volumeDoseMl = volumeDoseMl; }

    public String getVoieAdministration() { return voieAdministration; }
    public void setVoieAdministration(String voieAdministration) { this.voieAdministration = voieAdministration; }

    public int getNombreDoses() { return nombreDoses; }
    public void setNombreDoses(int nombreDoses) { this.nombreDoses = nombreDoses; }

    public double getTemperatureConservation() { return temperatureConservation; }
    public void setTemperatureConservation(double temperatureConservation) { this.temperatureConservation = temperatureConservation; }

    public double getAiguilleTaille() { return aiguilleTaille; }
    public void setAiguilleTaille(double aiguilleTaille) { this.aiguilleTaille = aiguilleTaille; }
}
