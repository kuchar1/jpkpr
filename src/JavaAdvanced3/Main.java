package JavaAdvanced3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Akwarium a = new Akwarium();
		System.out.println("Podaj rodzaj zwierzadka: Rybka/Krewetka");
		Scanner input = new Scanner(System.in);
		String zwierzadko = input.nextLine();
		a.addAnimal(FabrykaZwierzatek.tworzZwierzadko(zwierzadko));
		
		
		
		
		
		
		a.uruchom();
		System.out.println(a.getClass().getName());
		
		
		
		
		// a.addAnimal(new Rybka());
		// a.addAnimal(new Rybka());
		// a.addAnimal(new Krewetka());
		// a.uruchom();
	}

}
