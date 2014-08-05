package Satelita;

public class RepainThread implements Runnable {

	Painting refPaintin;

	public RepainThread(Painting obiekt3) {
		this.refPaintin = obiekt3;
		Thread t = new Thread(this);
		t.start();
	}

	public void repaintCanvas() {
		while (true) {
			refPaintin.repaint();
			//System.out.println("repaint");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void run() {
		repaintCanvas();
	}
}
