package ma.edu.ensi.accesseurs;

public class Test3 {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		if(!"KADIRI".equals(e1.nom)) {
			e1.nom = "SALLAMI";
		}
		if(!"Mohammed".equals(e1.prenom)) {
			e1.prenom = "Said";
		}
		
		System.out.println(e1.nom);
		System.out.println(e1.prenom);
		
		//Etudiant e2 = new Etudiant("KADIRI Mohammed");
		//System.out.println(e2.nom);
		//System.out.println(e2.prenom);
	}
}
