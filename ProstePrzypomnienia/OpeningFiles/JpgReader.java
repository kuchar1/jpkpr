package OpeningFiles;

import java.awt.Graphics;
<<<<<<< HEAD
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> branch 'master' of https://github.com/kuchar1/jpkpr
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

<<<<<<< HEAD
public class JpgReader extends JFrame {

	int height;
	int width;
	BufferedImage image;

	public static void main(String[] args) {
		JpgReader frame1 = new JpgReader();
		frame1.paintFrame();
		frame1.repaint();
		
	}
	public void loadImage() {
		try {
			image = ImageIO.read(new File("C:/Users/4/workspace/jpkpr/Beagle.jpg"));
		} 
		catch (IOException e) {
			System.out.println("There is no file");
		}
		if( image == null){
			width=0;
			height =0;
		}
		else{
		width = image.getWidth();
		height = image.getHeight();
		}
	}
	public void paint(Graphics g) {
		g.drawImage(image, 0, 20, this);
	}
	public void paintFrame() {
		loadImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setName("JPGReader");
		setVisible(true);
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		paint(getGraphics());
		
			
		
	}
}
=======
public class JpgReader extends JFrame implements ActionListener{

	int height;
	int width;
	BufferedImage image;
	String directory;
	JFrame frameAbout;
	JLabel jlab;
	
	public static void main(String[] args) {
		JpgReader frame1 = new JpgReader();
		frame1.paintFrame();
		frame1.repaint();
		
	}
	
	public void loadImage() {
		try {
			image = ImageIO.read(new File(directory));
		} 
		catch (IOException e) {
			System.out.println("There is no file");
		}
		if( image == null){
			width=0;
			height =0;
		}
		else{
		width = image.getWidth();
		height = image.getHeight();
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, 0, 20, this);
	}
	
	public void paintFrame() {
		loadImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setName("JPGReader");
		setVisible(true);
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		paint(getGraphics());
		
	//Menu
		JMenuBar jmb = new JMenuBar();
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenuItem jmiExit = new JMenuItem("Exit");
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		JMenu jmHelp = new JMenu("Help");
		JMenuItem jmiAbout = new JMenuItem("About");
		jmHelp.add(jmiAbout);
		jmb.add(jmFile);
		jmb.add(jmHelp);
		setJMenuBar(jmb);
		//ActionListner
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiAbout.addActionListener(this);
	}	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comStr = e.getActionCommand();
		if ( comStr.equals("Exit")) {
			System.exit(0);
		}
		
		else if ( comStr.equals("About")) {
			frameAbout = new JFrame();
			frameAbout.setSize(250,100);
			frameAbout.setVisible(true);
			frameAbout.setLocationRelativeTo(null);
			jlab = new JLabel();
			frameAbout.add(jlab);
			jlab.setText("My first Paint program with Menu v0.1 :)");
		}	
		else if	( comStr.equals("Open")){
			JFileChooser openFile = new JFileChooser();
	    	openFile.setCurrentDirectory(new File(System.getProperty("user.home")));
	    	openFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
	    	openFile.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
	    	openFile.setAcceptAllFileFilterUsed(true);
	    	int result = openFile.showOpenDialog(this);
	    		if (result == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = openFile.getSelectedFile();
		             directory = selectedFile.getAbsolutePath();
	    		}
	    		else{
	    			directory = "4bhgshfsg45.jpg";
	    		}
		}		
			
	}		
			
			
	}	
	

>>>>>>> branch 'master' of https://github.com/kuchar1/jpkpr
