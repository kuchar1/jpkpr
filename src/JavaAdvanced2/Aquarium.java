package JavaAdvanced2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium<T> {

	List<T> list1 = new ArrayList<T>();

	/**
	 * @param nazwaWLiscie
	 *            metoda addToArrayList dodaje nam do listy obiekty
	 */
	public void addToArrayList(T nazwaWLiscie) {
		list1.add(nazwaWLiscie);
	}

	/**
	 * metoda iteruj¹ca ArrayListe
	 */
	public void iterowanie() {
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).toString());

		}
	}
}
