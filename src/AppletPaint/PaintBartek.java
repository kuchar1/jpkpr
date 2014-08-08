package AppletPaint;



import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Random;

public class PaintBartek extends Applet implements MouseMotionListener {
	
	int x=-1;
	int y=-1;
	int z=-1;
	int c=-1;
	
	public Paint(){		
		addMouseMotionListener(this);
		setSize(1000, 1000);
	}
	public void rysuj(Graphics g){
		
	 Graphics2D g2=(Graphics2D) g;
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.black);
		g2.drawLine(x,y,z,c);
		
			
		
		//g2.fillOval(x, y, 1, 1);
		//g2.drawArc(x, y, x, y, 0, 45);
		//g2.drawLine(x, y, z, c);
		//g2.drawRect(x, y, (int)Math.round(Math.sqrt(x)*Math.log(y)), (int)Math.round(Math.sqrt(y)*Math.log(x)));
		//g2.setColor(Color.BLUE);
		//g2.draw3DRect(x, y, (int)Math.round(Math.sqrt(x)*Math.log(y)), (int)Math.round(Math.sqrt(y)*Math.log(x)), true);
		/*g2.setColor(Color.ORANGE);
		g2.drawArc(x, y, (int)Math.round(Math.sqrt(x)*Math.log(y)), (int)Math.round(Math.sqrt(y)*Math.log(x)), 0, 90);
		g2.setColor(Color.blue);
		g2.drawArc(x, y, (int)Math.round(Math.sqrt(x)*Math.log(y)), (int)Math.round(Math.sqrt(y)*Math.log(x)), 90, 90);
		g2.setColor(Color.GREEN);
		g2.drawArc(x, y, (int)Math.round(Math.sqrt(x)*Math.log(y)), (int)Math.round(Math.sqrt(y)*Math.log(x)), 180, 180);
		//g2.setColor(Color.RED);
		//g2.drawOval(x, y, (int)Math.round(Math.sqrt(x)*Math.log(y)), (int)Math.round(Math.sqrt(y)*Math.log(x)));
		g2.setColor(Color.RED);
		g2.drawArc(x, y, (int)Math.round(Math.sqrt(x)*Math.log(y)), (int)Math.round(Math.sqrt(y)*Math.log(x)), 180, 90);
	}*/
	}
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		rysuj(this.getGraphics());
		z=x;
		c=y;
	}

	//@Override
	public void mouseMoved(MouseEvent e) {
		
		z=e.getX();
		c=e.getY();
	}

	
	
}
