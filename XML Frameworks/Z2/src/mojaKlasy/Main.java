package mojaKlasy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext mojKontener2 = new ClassPathXmlApplicationContext(
				"beans2.xml");

	}

}
