package AppletsFromHome;

import java.applet.*;
import java.awt.Color;

public class SoundApplet1 extends Applet {
	
	AudioClip soundFile1;
	
	public void init() {
		AudioClip soundFile1 = getAudioClip(getDocumentBase(), "01.au"/*plik 01 laduje w folderze src*/);
		//SoundApplet1 ap= new SoundApplet1();
		soundFile1.loop();
	}
}