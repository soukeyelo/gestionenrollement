package sn.isep.ApplicationEnrollement;

public class TechnicienInformatique {
    private int id;
    private String nom;
    private String prenom;
    private String domaineExpertise;

    public TechnicienInformatique(int id, String nom, String prenom, String domaineExpertise) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.domaineExpertise = domaineExpertise;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDomaineExpertise() {
        return domaineExpertise;
}
}
