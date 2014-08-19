package mojaKlasy;

public class Czlowiek {
	private String imie;
	private INapoje mojNapuj;
	private Adres adres;
	
	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	

	

	public Czlowiek(String imie) {
		super();
		this.imie = imie;
	}

	public INapoje getMojNapuj() {
		return mojNapuj;
	}

	public void setMojNapuj(INapoje mojNapuj) {
		this.mojNapuj = mojNapuj;
		mojNapuj.toString();
	}

	public Czlowiek() {
	}

	public void przedstawSie() {
		System.out.println("Czesc jestem: " + this.imie);

	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	@Override
	public String toString() {
		String ret = this.imie;
		if (this.mojNapuj != null) {
			ret += " pije napuj: " + mojNapuj.toString();
		}
		if (this.adres != null) {
			ret += " adres: " + adres.toString();
		}
		
		return "Moje imie to: " + imie + " Adres to:"+ adres;
	}

}
