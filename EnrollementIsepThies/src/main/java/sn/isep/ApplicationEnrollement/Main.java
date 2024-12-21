package sn.isep.ApplicationEnrollement;

import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            GestionEnrollement gestion = new GestionEnrollement();

            int choix;
            do {
                System.out.println("\n--- Menu Principal ---");
                System.out.println("1. Ajouter un étudiant");
                System.out.println("2. Ajouter une filière");
                System.out.println("3. Ajouter un enseignant");
                System.out.println("4. Ajouter un technicien informatique");
                System.out.println("5. Affecter un étudiant à une filière");
                System.out.println("6. Afficher les étudiants");
                System.out.println("7. Afficher les enseignants");
                System.out.println("8. Afficher les techniciens informatiques");
                System.out.println("0. Quitter");
                System.out.print("Choisissez une option : ");
                choix = scanner.nextInt();
                scanner.nextLine(); // Consommer la ligne restante

                switch (choix) {
                    case 1:
                        System.out.println("\n--- Ajouter un étudiant ---");
                        System.out.print("ID : ");
                        int idEtudiant = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nom : ");
                        String nomEtudiant = scanner.nextLine();
                        System.out.print("Prénom : ");
                        String prenomEtudiant = scanner.nextLine();
                        System.out.print("Numéro de bachelier : ");
                        String numeroBachelier = scanner.nextLine();
                        System.out.print("Adresse : ");
                        String adresse = scanner.nextLine();
                        System.out.print("Téléphone : ");
                        String telephone = scanner.nextLine();
                        Etudiant etudiant = new Etudiant(idEtudiant, nomEtudiant, prenomEtudiant, numeroBachelier, adresse, telephone);
                        gestion.inscrireEtudiant(etudiant);
                        break;

                    case 2:
                        System.out.println("\n--- Ajouter une filière ---");
                        System.out.print("ID : ");
                        int idFiliere = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nom : ");
                        String nomFiliere = scanner.nextLine();
                        System.out.print("Capacité : ");
                        int capacite = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Description : ");
                        String descriptionFiliere = scanner.nextLine();
                        Filiere filiere = new Filiere(idFiliere, nomFiliere, capacite, descriptionFiliere);
                        gestion.ajouterFiliere(filiere);
                        break;

                    case 3:
                        System.out.println("\n--- Ajouter un enseignant ---");
                        System.out.print("ID : ");
                        int idEnseignant = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nom : ");
                        String nomEnseignant = scanner.nextLine();
                        System.out.print("Prénom : ");
                        String prenomEnseignant = scanner.nextLine();
                        System.out.print("Spécialité : ");
                        String specialite = scanner.nextLine();
                        Enseignant enseignant = new Enseignant(idEnseignant, nomEnseignant, prenomEnseignant, specialite);
                        gestion.inscrireEnseignant(enseignant);
                        break;

                    case 4:
                        System.out.println("\n--- Ajouter un technicien informatique ---");
                        System.out.print("ID : ");
                        int idTechnicien = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nom : ");
                        String nomTechnicien = scanner.nextLine();
                        System.out.print("Prénom : ");
                        String prenomTechnicien = scanner.nextLine();
                        System.out.print("Domaine d'expertise : ");
                        String domaineExpertise = scanner.nextLine();
                        TechnicienInformatique technicien = new TechnicienInformatique(idTechnicien, nomTechnicien, prenomTechnicien, domaineExpertise);
                        gestion.ajouterTechnicien(technicien);
                        break;

                    case 5:
                        System.out.println("\n--- Affecter un étudiant à une filière ---");
                        System.out.print("ID de l'étudiant : ");
                        int etudiantId = scanner.nextInt();
                        System.out.print("ID de la filière : ");
                        int filiereId = scanner.nextInt();
                        gestion.affecterEtudiant(etudiantId, filiereId);
                        break;

                    case 6:
                        System.out.println("\n--- Liste des étudiants ---");
                        gestion.afficherEtudiants();
                        break;

                    case 7:
                        System.out.println("\n--- Liste des enseignants ---");
                        gestion.afficherEnseignants();
                        break;

                    case 8:
                        System.out.println("\n--- Liste des techniciens informatiques ---");
                        gestion.afficherTechniciens();
                        break;

                    case 0:
                        System.out.println("Merci d'avoir utilisé l'application. À bientôt !");
                        break;

                    default:
                        System.out.println("Option invalide, veuillez réessayer.");
                }
            } while (choix != 0);

            scanner.close();
}

}
