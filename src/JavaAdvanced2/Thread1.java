package JavaAdvanced2;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 implements Runnable {

	Thread t1;
	ThreadsAtomic refThreadsAtomic;

	public Thread1(ThreadsAtomic obiect1) {
		this.refThreadsAtomic = obiect1;
		t1 = new Thread(this);
		t1.start();
	}

	public AtomicInteger increment() {
		
		refThreadsAtomic.c.incrementAndGet();
		
		return refThreadsAtomic.c;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			increment();
			//
			System.out.println("Thread1 enabled");
			System.out.println(refThreadsAtomic.c);
		
//		try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		

	}
}
