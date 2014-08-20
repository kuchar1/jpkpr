package ImagesViewer01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImagesViewer01 extends JFrame implements ActionListener {

	int height = 500;
	int width = 500;
	String directory;
	BufferedImage image;

	public static void main(String[] args) {

		ImagesViewer01 frame1 = new ImagesViewer01();
		frame1.drawFrame();
		
	}
//	public void paint(Graphics g) {
//			g.drawImage(image, 0, 20, this);
//			g.setColor(Color.black);
//			g.fillRect(0, 0, 50, 50);
//			System.out.println("jest Paint!");
//		}
	
	public void drawFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JPGReader");
		setVisible(true);
		setSize(width, height);
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
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		//paint(getGraphics());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comStr = e.getActionCommand();
		if (comStr.equals("Exit")) {
			System.exit(0);
		}

		else if (comStr.equals("Open")) {
			JFileChooser openFile = new JFileChooser();
			openFile.setCurrentDirectory(new File(System
					.getProperty("user.home")));
			openFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
			openFile.addChoosableFileFilter(new FileNameExtensionFilter(
					"Images", "jpg", "png", "gif", "bmp"));
			openFile.setAcceptAllFileFilterUsed(true);
			int result = openFile.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
				File selectedFile = openFile.getSelectedFile();
				directory = selectedFile.getAbsolutePath();
				loadImage();

			} else {
				directory = "4bhgshfsg45.jpg";
			}
		}
	}

	public void loadImage() {
		try {
			image = ImageIO.read(new File(directory));
		} 
		catch (IOException e) {
			System.out.println("There is no file");
		}
		if (image == null) {
			width = 700;
			height = 700;
		} 
		else {
			width = image.getWidth();
			height = image.getHeight();
			System.out.println("Jest zaladowany obraz. Wymiary obrazu: Szer: " + width + " Wys: " + height);
			resize(width, height);
			
		}
		
	}
	
}
