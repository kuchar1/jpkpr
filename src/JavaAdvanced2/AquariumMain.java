package JavaAdvanced2;

public class AquariumMain {

	public static void main(String args[]) {
		Aquarium<Fish> ak1 = new Aquarium<Fish>();
		ak1.addToArrayList(new Fish("Stasia"));
		ak1.addToArrayList(new Fish("Rysia"));
		ak1.addToArrayList(new Fish("Juzia"));
		ak1.iterowanie();
	}
}

