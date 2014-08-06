package AppletPaint;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicArrowButton;

public class Okienko extends JFrame {
	
	BasicArrowButton czarny;
	Button czerwony, zolty;
	
	public Okienko(){
		
		Paint p=new Paint();
		add(p);
		//czarny=new BasicArrowButton(WIDTH, Color.black, Color.black, Color.black, Color.black);
	   // add(czarny);
		czerwony =new Button("czerwony");
		add(czerwony);
	
	}

	
		

	

}
