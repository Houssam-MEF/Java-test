import java.util.ArrayList;

public class Polymorphisme {
    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.marcher();

        Animal chien = new Chien();
        chien.marcher();

        // NB !
        // Class obj = new class();
        // obj : variable qui fait référence à l'objet

        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(new Chat());
        animaux.add(new Chat());
        animaux.add(new Chien());
        animaux.add(new Chien());
        animaux.add(new Animal());

        animaux.forEach(el -> el.marcher());
        
        for(Animal animal : animaux) animal.marcher();

    }
    
}
