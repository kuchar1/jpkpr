package MultiThreadALONE;

public class MineClass {

	
	public static void main(String[] args){
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		while(true){
			System.out.println(thread2.x);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Wystapil blad"); //<----- tu wpisujemy tekst bledu jezeli nie stanie sie try!
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	
	
}
