package SimpleConstructor;

public class Main {

	public static void main(String[] args) {

		MyClass object1 = new MyClass("Alex", 12);
		MyClass object2 = new MyClass("Roger", 13);
		object1.dataPrinting();
		object2.dataPrinting();
	}
}
