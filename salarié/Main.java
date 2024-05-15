package salarié;
import salarié.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Salarie ali = new Directeur("Direct 1");
        Salarie omar = new Chef("Chef 1");
        Salarie toto = new Ouvrier("Ouvrier 1");

        ArrayList<Salarie> salaries = new ArrayList<>();
        salaries.add(ali);
        salaries.add(omar);
        salaries.add(toto);

        for(Salarie sal : salaries) System.out.println(sal.toString());

    }
}
