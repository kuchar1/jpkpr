package Kawa;

public class Czlowiek {
	
	String imie;
	Kawa kawaZapKawa; 
	
	public Czlowiek (Kawa kawa){
		if(kawa != null){
		this.kawaZapKawa = kawa;
		}
		else{
			this.kawaZapKawa = new Kawa();
		}
	}
	
	public Czlowiek (){
	}
		
	public void pijKaweUtwuzLokalnie(){
		Kawa mojakawa = new Kawa();
		mojakawa.zaparz();
		mojakawa.wypij();
	}
	
	public void pijPrzezArgument(){
		Kawa mojakawa = new Kawa();
		mojakawa.zaparz();
		mojakawa.wypij();
	}
		
	public void pijKawaZapamietana(){
		this.kawaZapKawa.zaparz();
		this.kawaZapKawa.zaparz();	
	}	
		
	public void kawaZKonstruktora(){
		this.kawaZapKawa.zaparz();
		this.kawaZapKawa.zaparz();
	}
	
	public void setKawa (Kawa jakasTamKawa){
		if(jakasTamKawa != null){
			this.kawaZapKawa = jakasTamKawa;
		}
		else{
			this.kawaZapKawa = new Kawa();
		}
	}	
}
