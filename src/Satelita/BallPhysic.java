package Satelita;

public class BallPhysic implements Runnable {

	Painting refPainting1;
	// orbitX
	// orbitY
	double i;
	private boolean przelacznik = true;

	public BallPhysic(Painting obiekt4) {
		this.refPainting1 = obiekt4;
		Thread t1 = new Thread(this);
		t1.start();
	}

	public void ballMovement() {
		while (true) {
			// for (i=45; i<360;i++){
			// System.out.println("Thread2");
			// {

			// refPainting1.orbitX = (int)
			// (refPainting1.orbitX+(Math.cos(i)*75));
			// refPainting1.orbitY = (int)
			// (refPainting1.orbitY+(Math.sin(i)*75));

			if (przelacznik == false) {
				refPainting1.TloX -= 1;
				if (refPainting1.TloX == -600) {
					przelacznik = true;
				}
			}
			
			else if (przelacznik == true) {
				refPainting1.TloX += 1;
				if (refPainting1.TloX == 1) {
					przelacznik = false;
				}
			}
			

			System.out.println(refPainting1.TloX);

			// }
			// System.out.println("Wartosc orbitX: " + Math.cos(i)+ i);

			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// posX1:=Cos(Theta)*R1+oX;
			// posY1:=Sin(Theta)*R1+oY;

		}

		// }

	}

	// @Override
	public void run() {
		ballMovement();

	}

}