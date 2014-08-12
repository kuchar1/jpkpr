package OpeningFiles;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

 
public class JpgReader extends JFrame{
 
  public static void getJpg()  {
    try{
      // the line that reads the image file
      BufferedImage image = ImageIO.read(new File("Beagle.jpg"));
      // work with the image here ...
    }
    catch (IOException e)    {
      // log the exception
      // re-throw if desired
    }
  }
 
  public static void main(String[] args)  {
    JFrame frame1= new JFrame();
    frame1.setName("JPGReader");
    frame1.setSize(500, 500);
    frame1.setLocationRelativeTo(null);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setVisible(true);
    getJpg();
    
  }
 
}
