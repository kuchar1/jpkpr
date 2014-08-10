package MyOwnPaint;



import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class PaintZNeta extends JPanel
{
 
    private Image TomatoImage;
     
    public PaintZNeta() throws IOException
    {
        super();
 
        File outputfile2 = new File("RotatedTomato.gif");
 
        TomatoImage = ImageIO.read(getClass().getClassLoader().getResource("Beagle.jpg"));
 
        BufferedImage Buf_Image = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
 
        Graphics gT = Buf_Image.createGraphics();
         
        drawImage(gT);
 
        gT.dispose();
 
        try
        {
            ImageIO.write(Buf_Image, "gif", outputfile2);
        } catch (IOException ex)
        {
            Logger.getLogger(PaintZNeta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    @Override
    public void paintComponent(Graphics g)
    {
        drawImage(g);
    }
 
    private void drawImage(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.translate(400, 400);
 
        for (double i = 0; i <= 1.0; i = i + 0.001)
        {
            g2d.rotate(i);
            g2d.drawImage(TomatoImage, 0, 0, 200, 200, this);
        }
       
    }
 
    public static void main(String arg[]) throws IOException
    {
        JFrame frame = new JFrame("RotateImage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
 
        PaintZNeta panel = new PaintZNeta();
 
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}