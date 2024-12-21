package sn.isep.ApplicationEnrollement;

public class Orientation {
    private int id;
    private Etudiant etudiant;
    private Filiere filiere;
    private String dateAffectation;

    public Orientation(int id, Etudiant etudiant, Filiere filiere, String dateAffectation) {
        this.id = id;
        this.etudiant = etudiant;
        this.filiere = filiere;
        this.dateAffectation = dateAffectation;
    }

    public int getId() {
        return id;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public String getDateAffectation() {
        return dateAffectation;
}
}

