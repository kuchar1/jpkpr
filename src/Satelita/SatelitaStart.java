package Satelita;

public class SatelitaStart {

	public static void main(String[] args) throws InterruptedException {

		Frame frame1 = new Frame();
		frame1.frameDrawing();
		RepainThread watek1 = new RepainThread(frame1.shortcutCanvas/*
																	 * Wskazuje
																	 * do
																	 * miejsca
																	 * gdzie
																	 * jest
																	 * canvas
																	 */);
		BallPhysic watek2 = new BallPhysic(frame1.shortcutCanvas);
	}
}
