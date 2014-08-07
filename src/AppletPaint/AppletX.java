package AppletPaint;

import java.awt.*;
import java.applet.*;

public class AppletX extends Applet implements Runnable
{
 //private static final long serialVersionUID = -705555689585339843L;
 Thread t1;
  Image i1;
  Graphics gc;
  int x, y, r;    
  int w, h;   
   
  public void init()
  {
    t1 = null;
    this.setBounds(0, 0, 500, 80);
    w=getSize().width;
    h=getSize().height;
    x=0;
    y = h/6;
    r = (int)(h/1.5);
    i1=createImage(w,h);
    gc = i1.getGraphics();  
    gc.fillRect(0, 0, w, h); 
    
  }
  
  public void start()
  {
    if (t1 == null) {
      t1 = new Thread(this);
      t1.start();
    }
  }

  public void stop()
  {
    if (t1 != null){
      t1 = null;
   }
  }

  public void run()
  {
    while(t1!=null)
    {
      gc = i1.getGraphics();
      x ++;      
      if(x == w)  x = (int) (-h/1.5);
      
      gc.setColor(Color.white);
      gc.fillRect(0,0,w,h);    

      gc.setColor(Color.black);
      gc.fillOval(x, y, r, r);
      System.out.println("cos");
      repaint();  
      
      try {
        Thread.sleep(5);
      } catch(InterruptedException e){
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
