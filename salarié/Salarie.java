package salarié;

public class Salarie {

    double salaire;
    String nom;

    Salarie(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return this.nom + " " + this.salaire;
    }

    public void afficherSalaire() {
        System.out.println(this.salaire);
    }
}
