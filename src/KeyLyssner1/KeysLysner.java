package KeyLyssner1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeysLysner implements KeyListener {

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT) {
			System.out.println("right");
		}

		if (key == KeyEvent.VK_LEFT) {
			System.out.println("left");
		}

		if (key == KeyEvent.VK_UP) {
			System.out.println("up");
		}

		if (key == KeyEvent.VK_DOWN) {
			System.out.println("down");
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
