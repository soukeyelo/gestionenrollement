package sn.isep.ApplicationEnrollement;

import java.util.ArrayList;

public class GestionEnrollement {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();
    private ArrayList<Filiere> filieres = new ArrayList<>();
    private ArrayList<Departement> departements = new ArrayList<>();
    private ArrayList<Orientation> orientations = new ArrayList<>();
    private ArrayList<Enseignant> enseignants = new ArrayList<>();
    private ArrayList<TechnicienInformatique> techniciens = new ArrayList<>();

    // Inscrire un étudiant
    public void inscrireEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        System.out.println("Étudiant inscrit avec succès : " + etudiant.getNom() + " " + etudiant.getPrenom());
    }

    // Ajouter une filière
    public void ajouterFiliere(Filiere filiere) {
        filieres.add(filiere);
        System.out.println("Filière ajoutée avec succès : " + filiere.getNom());
    }

    // Affecter un étudiant à une filière
    public void affecterEtudiant(int etudiantId, int filiereId) {
        Etudiant etudiant = null;
        Filiere filiere = null;

        for (Etudiant e : etudiants) {
            if (e.getId() == etudiantId) {
                etudiant = e;
                break;
            }
        }

        for (Filiere f : filieres) {
            if (f.getId() == filiereId) {
                filiere = f;
                break;
            }
        }

        if (etudiant != null && filiere != null) {
            Orientation orientation = new Orientation(orientations.size() + 1, etudiant, filiere, "2024-12-19");
            orientations.add(orientation);
            System.out.println("Étudiant " + etudiant.getNom() + " affecté à la filière " + filiere.getNom() + ".");
        } else {
            System.out.println("Échec : Étudiant ou Filière introuvable.");
        }
    }

    // Inscrire un enseignant
    public void inscrireEnseignant(Enseignant enseignant) {
        enseignants.add(enseignant);
        System.out.println("Enseignant inscrit avec succès : " + enseignant.getNom() + " " + enseignant.getPrenom());
    }

    // Ajouter un technicien informatique
    public void ajouterTechnicien(TechnicienInformatique technicien) {
        techniciens.add(technicien);
        System.out.println("Technicien informatique ajouté avec succès : " + technicien.getNom() + " " + technicien.getPrenom());
    }

    // Afficher tous les étudiants
    public void afficherEtudiants() {
        System.out.println("Liste des étudiants inscrits :");
        for (Etudiant e : etudiants) {
            System.out.println("- " + e.getNom() + " " + e.getPrenom());
        }
    }

    // Afficher tous les enseignants
    public void afficherEnseignants() {
        System.out.println("Liste des enseignants inscrits :");
        for (Enseignant e : enseignants) {
            System.out.println("- " + e.getNom() + " " + e.getPrenom() + " (Spécialité : " + e.getSpecialite() + ")");
        }
    }

    // Afficher tous les techniciens informatiques
    public <TechnicienInformatique> void afficherTechniciens() {
        System.out.println("Liste des techniciens informatiques :");
        techniciens.stream().map(t -> "- " + t.getNom() + " " + t.getPrenom() + " (Expertise : " + t.getDomaineExpertise() + ")").forEach(System.out::println);
}
}


