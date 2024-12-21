package sn.isep.ApplicationEnrollement;


    public class Enseignant {
        private int id;
        private String nom;
        private String prenom;
        private String specialite;

        public Enseignant(int id, String nom, String prenom, String specialite) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.specialite = specialite;
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

        public String getSpecialite() {
            return specialite;
}
    }


