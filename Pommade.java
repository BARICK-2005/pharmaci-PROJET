package org.example;

public class Pommade extends Medicament {
    private double quantiteGr;
    private String zoneApplication;
    private String typePeau;
    private String profondeurPenetration;
    private String usage;

    public Pommade(String nomCommercial, String code, double prix, java.time.LocalDate dateExpiration,
                   int stock, String laboratoire, String categorie,
                   double quantiteGr, String zoneApplication, String typePeau, String profondeurPenetration, String usage) {
        super(nomCommercial, code, prix, dateExpiration, stock, laboratoire, categorie);
        this.quantiteGr = quantiteGr;
        this.zoneApplication = zoneApplication;
        this.typePeau = typePeau;
        this.profondeurPenetration = profondeurPenetration;
        this.usage = usage;
    }

    // Getters & Setters
    public double getQuantiteGr() { return quantiteGr; }
    public void setQuantiteGr(double quantiteGr) { this.quantiteGr = quantiteGr; }

    public String getZoneApplication() { return zoneApplication; }
    public void setZoneApplication(String zoneApplication) { this.zoneApplication = zoneApplication; }

    public String getTypePeau() { return typePeau; }
    public void setTypePeau(String typePeau) { this.typePeau = typePeau; }

    public String getProfondeurPenetration() { return profondeurPenetration; }
    public void setProfondeurPenetration(String profondeurPenetration) { this.profondeurPenetration = profondeurPenetration; }

    public String getUsage() { return usage; }
    public void setUsage(String usage) { this.usage = usage; }
}



package pharmacie;




