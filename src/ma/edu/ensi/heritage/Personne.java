package ma.edu.ensi.heritage;

public class Personne {
	private String nom, prenom;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void parler() {
		System.out.println("Je parle");
	}

	public void marcher() {
		System.out.println("Je marche");
	}
}
