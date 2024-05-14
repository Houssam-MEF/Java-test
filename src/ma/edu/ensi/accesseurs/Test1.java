package ma.edu.ensi.accesseurs;

public class Test1 {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		
		if(!"KADIRI".equals(e1.nom)) {
			e1.nom = "SALLAMI";
		}
		if(!"Mohammed".equals(e1.prenom)) {
			e1.prenom = "Said";
		}
		
		System.out.println("Test 1; Le nom : " + e1.nom);
		System.out.println("Test 1; Le prenom : " + e1.prenom);
		
		//System.out.println("Le nom est : " + e1.getNom());
		//e1.setNom("CHANGED");
		//System.out.println("Le nom est : " + e1.getNom());
		//System.out.println("Le prenom est : " + e1.getPrenom());
		
		//Etudiant e2 = new Etudiant("KADIRI Mohammed");
		//System.out.println(e2.nom);
		//System.out.println(e2.prenom);
	}
}
