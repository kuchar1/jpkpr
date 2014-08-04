package PodstawyKonstruktorZmianaWartosciXY;

public class ValueChangeClass {

	Start refObiect1;
	int x,y;
	
	
	
	public ValueChangeClass(Start obiect1) {
		this.refObiect1 = obiect1;
	}

	public void valueChenge() {
		refObiect1.x = refObiect1.x + 10;
		refObiect1.y = refObiect1.y + 5;
		System.out.println("Wartoœci X i Y z klasy zmieniaj¹cej wartoœci: " + x+ " " +  y);
	}

}
