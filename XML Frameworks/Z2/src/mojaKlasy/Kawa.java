package mojaKlasy;

public class Kawa implements INapuj {

	static int licznikKawy;

	@Override
	public void pijNapuj() {
		if (licznikKawy <= 0) {
			System.out.println("Brak kawy w automacie przelaczam na Herbate");
		} else {
			System.out.println("Ilosc pozostalych kaw w automacie: "+ licznikKawy);
			System.out.println("Pije kawe");
			
					

		}

	}

}
