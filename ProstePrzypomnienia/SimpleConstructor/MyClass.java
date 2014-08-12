package SimpleConstructor;

public class MyClass {

	String fornameFromMain;
	int ageFromMain;

	public MyClass(String forname, int age) {
		ageFromMain = age;
		fornameFromMain = forname;
	}

	public String getName() {
		return fornameFromMain;
	}

	public int getAge() {
		return ageFromMain;
	}

	public void dataPrinting() {
		System.out.println(getName());
		System.out.println(getAge());
	}
}
