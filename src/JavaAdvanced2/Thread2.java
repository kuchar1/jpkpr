package JavaAdvanced2;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread2 implements Runnable {

	Thread t2;
	ThreadsAtomic refThreadsAtomic2;

	public Thread2(ThreadsAtomic obiect2) {
		this.refThreadsAtomic2 = obiect2;
		t2 = new Thread(this);
		t2.start();
	}

	public AtomicInteger decrement() {
		
		 
		refThreadsAtomic2.c.set(50);
		
		return refThreadsAtomic2.c;
	}

	@Override
	public void run() {
		
			decrement();
			
			System.out.println("Thread2 enabled");
			System.out.println(refThreadsAtomic2.c);
			
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		

	}
}