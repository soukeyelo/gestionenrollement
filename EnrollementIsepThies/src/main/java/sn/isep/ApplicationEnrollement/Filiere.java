package sn.isep.ApplicationEnrollement;


    public class Filiere {
        private int id;
        private String nom;
        private int capacite;
        private String description;

        public Filiere(int id, String nom, int capacite, String description) {
            this.id = id;
            this.nom = nom;
            this.capacite = capacite;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public String getNom() {
            return nom;
        }

        public int getCapacite() {
            return capacite;
        }

        public String getDescription() {
            return description;
}
}


