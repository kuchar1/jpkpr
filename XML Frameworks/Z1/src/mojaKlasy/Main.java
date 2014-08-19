package mojaKlasy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		//ApplicationContext mojKontener = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext mojKontener2 = new ClassPathXmlApplicationContext("beans2.xml");
	
		Object o4= mojKontener2.getBean("sensownaNazwa");
		//System.out.println(o4.toString());
		
		
		
		
		//Czlowiek o3 = (Czlowiek) mojKontener.getBean("ja3");
		//System.out.println(o3.toString());
		
	/*	
		Czlowiek o = (Czlowiek) mojKontener.getBean("ja");
		Object o1= mojKontener.getBean("ja1");
		Object o2= mojKontener.getBean("czlekZAdresem");
		//Object k1= mojKontener.getBean("kawa1");
		
		System.out.println(o.toString()); 
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(mojKontener.getBean("kakao1").toString());
		System.out.println(mojKontener.getBean("kawa1").toString());
		
		
		//o.przedstawSie();
		
		Object [] list1 = mojKontener.getBeanNamesForType(Czlowiek.class);
		for (int i = 0; i < list1.length; i++){
	          // Object o4 = mojKontener.getBean(list1[i]);
	           System.out.println("Wypisane z ArrayListy " + mojKontener.getBean((String) list1[i]));
		}

	*/

	}

}
