package AppletPaint;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class AppletAnimationSymple extends Applet implements Runnable{
Image image;
Graphics gc;
int w ,h;




public void Init(){
	Thread thread = new Thread();
	thread.start();
}

	public void init(){
		
		image = createImage(100, 100);
		gc = image.getGraphics();
		gc.fillOval(0, 0, 30, 30);
	}

	public void paint(Graphics g){
		g.drawImage(image, 0,0, this);
	}





@Override
public void run() {
	// TODO Auto-generated method stub
	
}


}
