package MyOwnPaint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class FrameForPaint extends JFrame implements ActionListener{

	JLabel jlab;
	JFrame frameAbout;
	JFileChooser saveFile, openFile;
	//Object JFileChooser;
	PaintCore refPaintCore;
	
	
	PaintCore paint1 = new PaintCore();
	
	
	
//createFrame 	
	public void createFrame(){
		setTitle("MyOwnPaint v0.1");
		getContentPane().setBackground(Color.white);
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		add(new PaintCore());
		
//addMenu
		JMenuBar jmb = new JMenuBar();
		JMenu jmFile = new JMenu("File");
		
		
		//JMenuItem menuItem = new JMenuItem(new ImageIcon("Images/save.png"));
		//jmiSave.add(menuItem);
		
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenuItem jmiRepaint = new JMenuItem("Repaint");
		JMenuItem jmiExit = new JMenuItem("Exit");
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiRepaint);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		JMenu jmHelp = new JMenu("Help");
		JMenuItem jmiAbout = new JMenuItem("About");
		jmHelp.add(jmiAbout);
		jmb.add(jmFile);
		jmb.add(jmHelp);
		setJMenuBar(jmb);
//addActionListner		
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiRepaint.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiAbout.addActionListener(this);
		
	}
//ActionListner
	public void actionPerformed(ActionEvent e) {
		String comStr = e.getActionCommand();
		if ( comStr.equals("Exit")) {
			System.exit(0);
		}
		
		else if ( comStr.equals("About")) {
			frameAbout = new JFrame();
			frameAbout.setSize(250,100);
			frameAbout.setVisible(true);
			frameAbout.setLocationRelativeTo(null);
			jlab = new JLabel();
			frameAbout.add(jlab);
			jlab.setText("My first Paint program with Menu v0.1 :)");
		}	
			
		else if	( comStr.equals("Save")) {
			try {
		        FileOutputStream fos = new FileOutputStream("c:/plik.bmp");
		        ObjectOutputStream oos = new ObjectOutputStream(fos);
		        oos.writeObject(paint1);
		        oos.flush();
		        oos.close();
		        fos.close();
		      } catch (Exception ex) {
		        System.out.println("Trouble writing display list vector");
		      }
			
			//http://stackoverflow.com/questions/3961687/bufferedimage-to-bmp-in-java
			
			
			
			
			
			
		}    
            
        else if	( comStr.equals("Open")) {	
            openFile = new JFileChooser();
            openFile.showOpenDialog(null);
           if (openFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            	
            //	File plik = openFile.getSelectedFile();
            //	JOptionPane.showMessageDialog(null, "Wybrany plik to: " + openFile.getName());
           }
          
        
       
        
        
        
        
        
        
            
            
            
            
          /*  JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(parent);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
               System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());*/
          
            
            
            
            
            
            
            
            
            
            
            
        
       
        if ( comStr.equals("Repaint")) {
			refPaintCore.repaint();
        
	}
}
	/*
	 public void showOpenFileDialog() {
	        JFileChooser fileChooser = new JFileChooser();
	        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        //fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
	       // fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("MS Office Documents", "docx", "xlsx", "pptx"));
	        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
	        fileChooser.setAcceptAllFileFilterUsed(true);
	        int result = fileChooser.showOpenDialog(this);
	        if (result == JFileChooser.APPROVE_OPTION) {
	            File selectedFile = fileChooser.getSelectedFile();
	            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
	        }
	    }*/
}


// Beagle = new ImageIcon("Beagle.jpg").getImage();
// /g2.drawImage(Beagle, x, y, this);





