package Kawa;

public class MainKawa {

	
	
	public static void main(String[] args) {
		
		Czlowiek ja = new Czlowiek();
		ja.imie = "Asia";
		
		
			System.out.println("wer. 1 - obiekt tworzony lokalnie w metodzie");
			ja.pijKaweUtwuzLokalnie();
		
			System.out.println("wer. 2 - podanie obiektu prze zargument metody");
			//Kawa jakasNowaKawa = new Kawa();
			//ja.pijPrzezArgument(jakasNowaKawa);
			//ja.pijPrzezArgument(new Kawa());
		
			System.out.println("wer.3 - podanie obiektu w konstruktorze i zapamiêtanie jej jako argumentu");
			Czlowiek ktos = new Czlowiek(new Kawa());
			ktos.pijKawaZapamietana();
			
			System.out.println("wer.4 - podanie obiektu w konstruktorze ");
			Czlowiek ktos1 = new Czlowiek(new Kawa());
			ktos1.kawaZKonstruktora();
			
			
		
		}

	}
