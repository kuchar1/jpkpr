package AppletsFromHome;

import java.applet.*;
import java.awt.Color;

import javax.swing.*;

import java.io.*;
import java.net.*;
	public class APPletSound2 extends JApplet
	{
	    public class Sound // Holds one audio file
	    {
	  private AudioClip song; // Sound player
	  private URL songPath; // Sound path
	  Sound(String filename)
	  {
	     try
	     {
	    songPath = new URL(getCodeBase(),"Place.wav"); // Get the Sound URL
	    song = Applet.newAudioClip(songPath); // Load the Sound
	     }
	     catch(Exception e){} // Satisfy the catch
	  }
	  public void playSound()
	  {
	     song.loop(); // Play
	  }
	  public void stopSound()
	  {
	     song.stop(); // Stop
	  }
	  public void playSoundOnce()
	  {
	     song.play(); // Play only once
	  }
	    }
	    public void init()
	    {
	    	
	  Sound testsong = new Sound("Place.wav");
	  testsong.playSound();
	    }
	}
