package JavaAdvanced2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium <T> {

	List<T> list1 = new ArrayList<T>();

	public void addToArrayList(T nazwaWLiscie)	{
		list1.add(nazwaWLiscie);
	}

	public void iterowanie() {
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).toString());
		}
	}
}
