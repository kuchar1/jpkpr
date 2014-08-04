package KeyLyssner1;

import javax.swing.JFrame;

public class StartKeysLisner extends JFrame{

	public static void main(String[] args) {
		StartKeysLisner obiect1 = new StartKeysLisner();
		KeysLysner obiect2 = new KeysLysner();
		obiect1.addKeyListener(new KeysLysner());
		
		
	}

}
