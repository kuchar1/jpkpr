package MultiThreadALONE;

public class Thread1 implements Runnable {

	int i;
	int x;

	public Thread1() {
		Thread t1 = new Thread(this);
		t1.start();
	}

	public void counting() {
		for (i = 0; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if( i== 100){
			i=0;
		}
		}
	}

	public void run() {
		counting();
	}

}
