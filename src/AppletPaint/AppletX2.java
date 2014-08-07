package AppletPaint;
import java.awt.*;
import java.applet.*;

public class AppletX2 extends Applet implements Runnable
{
  //private static final long serialVersionUID = -705555689585339843L;
  public Thread thread;
  Image image;
  Graphics gc;
  int x;   // aktualna pozycja 
  int w;   // szeroko apletu
  int h;   // wysoko apletu
  int i;
   
  public void init()
  {
	setSize(1250, 200);
    thread = null;
    //this.setBounds(0, 0, 1250, 200);
    w=getSize().width;
    h=getSize().height;
    x=0;
    i=0;
    image=createImage(w,h);
    gc = image.getGraphics();  
    gc.fillRect(0, 0, w, h); 
    
  }
  
  public void start()
  {
    if (thread == null) {
      thread = new Thread(this);
      thread.start();
    }
  }

  public void stop()
  {
    if (thread != null){
      thread = null;
   }
  }

  public void run()
  {
    while(thread!=null)
    {
      gc = image.getGraphics();
      x ++;      
      if(x == w/4)  x = -30;
      
     // gc.setColor(Color.black);
      gc.fillRect(0,0,w,h);      //czyszczenie bufora 
      
      int r = (x+30)%10; //<------------co to znaczy ???
    		  
      if (r == 0 || r == 9 ) i = 0;
      if (r == 1 || r == 8 ) i = 1;
      if (r == 2 || r == 7 ) i = 2;
      if (r == 3 || r == 6 ) i = 3;
      if (r == 4 || r == 5 ) i = 4;
         
      gc.setColor(Color.white);	
      
      for (int j = x; j<=w/4; j++){
    	  if (j%10 == 0) gc.fillOval(j*4 + 25, h/2-11, 22, 22);  
      }

      gc.setColor(Color.yellow);
      gc.fillArc(x*4 , h/2 -30, 60, 60, i*10, 360 - i*20); //<------ pacman rysowanie czesci kola
      
      repaint();  //lub   paint(getGraphics());
      
      try {
        Thread.sleep(30);
      } catch(InterruptedException e){}
    }
   }
   
   synchronized public void paint(Graphics g){
     g.drawImage(image,0,0,this);
   }
   
   synchronized public void update(Graphics g){
     paint(g);
   } 
}
