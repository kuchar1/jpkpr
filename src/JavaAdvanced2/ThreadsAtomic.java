package JavaAdvanced2;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsAtomic {

	
	public static AtomicInteger c = new AtomicInteger(0);
	

	public static void main(String[] args) {

		
		ThreadsAtomic a= new ThreadsAtomic();
		
		Thread1 obiect1 = new Thread1(a);
		Thread2 obiect2 = new Thread2(a);
		
		
		
		
	

	}



	

	

	
	
		
	

}
