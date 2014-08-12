package JavaAdvanced2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium <T> {


	
	
	List<T> list1 = new ArrayList<>();

	public void addToArrayList(T nazwaWliscie) {
		list1.add(nazwaWliscie);
	}

	public void iterowanie() {
		for (int i = 0; i < list1.size(); i++) {

			System.out.println(list1.get(i).toString());
			
		}
	}

}
