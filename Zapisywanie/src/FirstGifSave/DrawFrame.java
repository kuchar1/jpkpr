package FirstGifSave;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DrawFrame extends JFrame{

public void drawFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JPGReader");
		setVisible(true);
		setSize(500/*width*/, 500/*height*/);
		setLocationRelativeTo(null);
		setResizable(false);
		

		// Menu
		JMenuBar jmb = new JMenuBar();
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenuItem jmiExit = new JMenuItem("Exit");
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		jmb.add(jmFile);
		setJMenuBar(jmb);
		// ActionListner
//		jmiOpen.addActionListener(this);
//		jmiSave.addActionListener(this);
//		jmiExit.addActionListener(this);
		//paint(getGraphics());
	}
}
