package AppletPaint;

import java.applet.*;
import java.awt.*;

public class MyPacman extends Applet implements Runnable{
	//private static final long serialVersionUID = -705555689585339843L;
	 Thread t1;
	Graphics g1;
	Image i1;
	int x,y,r;
	int w,h;
	
	
	public void init(){
		t1=null;
		this.setBounds(0, 0, 500, 80);
		w=getSize().width;
		h=getSize().height;
		x=0;
		y=h/6;
		r=(int) (h/1.5);
		i1 = createImage(w,h);
		g1 = i1.getGraphics();
		g1.fillRect(0, 0, w, h);
	
	}
	
	public void start(){
		if (t1 == null){
			t1 = new Thread(this);
		    t1.start();
		}
	}
		
	public void stop(){
		if(t1 != null){
			t1 = null;
		}
	}
	
	public void run(){
		while (t1 != null ){
			g1 = i1.getGraphics();
			x=x+1;
			if (x==w ) x= (int) (-h/1.5);
			
			g1.setColor(Color.white);
			g1.fillRect(0,0,w,h);
			
			g1.setColor(Color.black);
			g1.fillOval(x,y,r,r);
			System.out.println("cos");
			repaint();
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	 synchronized public void paint(Graphics g){
	     g.drawImage(i1,0,0,this);
	   }
	   
	 synchronized public void update(Graphics g){
	     paint(g);
	   } 
}
