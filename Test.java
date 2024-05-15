import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] tab = new int[3];
		// tab[1] = 10;
		// System.out.println(tab[1]);
		
		// int[] tab1 = {10, 20, 30};
		// tab1[1] = 5;
		// System.out.println(tab1[1]);

		ArrayList<String> tab = new ArrayList<>();
		tab.add("MED");
		tab.add("AYA");
		tab.add("Omar");
		System.out.println(tab);
		System.out.println("On a " + tab.size() + " elements");
		tab.forEach(el-> System.out.println(el));

		ArrayList<Integer> tabInt = new ArrayList<>();
		tabInt.add(10);
		tabInt.add(20);
		tabInt.add(30);
		System.out.println(tabInt);

		
	}

}
