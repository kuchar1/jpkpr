package OpeningFiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

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
