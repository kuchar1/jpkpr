package PodstawyKonstruktorZmianaWartosciXY;

public class Start {

	int x = 10, y = 15;

	public static void main(String[] args) {

		Start obiect1 = new Start();
		ValueChangeClass obiect2 = new ValueChangeClass(obiect1);
		System.out.println("Warto�ci X i Y przed zmiana: "+ obiect1.x + " "+ obiect1.y);
		
		
		
		obiect2.valueChenge();
		System.out.println("arto�ci X i Y oo zmianie: " +obiect1.x + " "+ obiect1.y);
		
		
	}

}
