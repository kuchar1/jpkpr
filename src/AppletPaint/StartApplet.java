package AppletPaint;




import javax.swing.JFrame;



public class StartApplet extends JFrame {

	public static void main(String[] args) {
		Okienko o=new Okienko();
		
		o.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		o.setSize(400, 300);
		o.setVisible(true);
	}
	}


