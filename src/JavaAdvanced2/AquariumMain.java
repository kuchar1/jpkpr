package JavaAdvanced2;


public class AquariumMain {

	public static void main(String args[]) {
		Aquarium<Fish> ak1 = new Aquarium<Fish>();
		ak1.addToArrayList(new Fish("Stasia"));
		ak1.addToArrayList(new Fish("rysia"));
		ak1.addToArrayList(new Fish("juzia"));
		ak1.iterowanie();
		
		
		System.out.println(ak1.list1.get(0).imie);
		
		
	}
}

