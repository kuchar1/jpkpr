package MultiThreadALONE;

import java.util.Random;

public class Thread2 implements Runnable {

	int x;

	public Thread2() {
		Thread t2 = new Thread();
		t2.start();
	}

	public int method2() {
		while (true) {
			Random generator = new Random();
			x = generator.nextInt(100);
			return x;
		}
	}

	public void run() {
		method2();
	}
}
