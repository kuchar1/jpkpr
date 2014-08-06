package AppletPaint;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Paint extends Applet implements  KeyListener, MouseListener, MouseMotionListener {
	
	int x=-1,y=-1, x2=-1,y2=-1;
	boolean nnw=false;
	
	Panel control,top,action;
	Label l1,l2,l3,l4;
	 TextField textx;
	 TextField texty;
	 TextField texttool;
     TextField textcolor;
	 
	 
	public Paint(){
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.white);
		
		
	}

	public void rysuj(Graphics g){
		
	 Graphics2D g2=(Graphics2D) g;
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.black);
		
		if(x2 !=-1 && x != -1){
			g2.drawLine(x, y, x2, y2);
		}
		else if(nnw){
			g2.setColor(Color.white);
			g2.fillRect(-10, -10, 600, 600);
			nnw=false;
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x2=e.getX();
		y2=e.getY();
		rysuj(this.getGraphics());
		x=x2;
		y=y2;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	  
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void mousePressed(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		rysuj(this.getGraphics());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x=-1;
		x2=-1;
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() == 'n')
			nnw=true;
		
	}

	
	
}
