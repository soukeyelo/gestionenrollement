package sn.isep.ApplicationEnrollement;


    public class Etudiant {
        private int id;
        private String nom;
        private String prenom;
        private String numeroBachelier;
        private final String adresse;
        private String telephone;

        public Etudiant(int id, String nom, String prenom, String numeroBachelier, String adresse, String telephone) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.numeroBachelier = numeroBachelier;
            this.adresse = adresse;
            this.telephone = telephone;
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

        public String getNumeroBachelier() {
            return numeroBachelier;
        }

        public String getAdresse() {
            return adresse;
        }

        public String getTelephone() {
            return telephone;
}
    }


