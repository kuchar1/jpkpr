package JavaAdvanced3;

import java.util.ArrayList;

public class Akwarium {

	ArrayList<ZwierzeAkwariowe> zawartosc = new ArrayList<>();

	public void uruchom() {
		for (ZwierzeAkwariowe r : zawartosc) {
			r.plyn();
		}
	}

	public void addAnimal(ZwierzeAkwariowe z) {
		if (z==null){
			return;
		}
		zawartosc.add(z);
	}

	/*public Akwarium() {
		this.addAnimal(new Rybka());
		this.addAnimal(new Rybka());
		this.addAnimal(new Krewetka());
		this.uruchom();
	}*/
}
