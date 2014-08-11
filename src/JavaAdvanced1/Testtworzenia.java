package JavaAdvanced1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testtworzenia {

	static FileWriter fw;
	
	
	public static void main(String[] args) throws IOException {
		
		
		Testtworzenia test = new Testtworzenia();
		
		File file = new File("C:\\Users\\4\\workspace\\File.txt");
		
		fw = new FileWriter(file.getAbsoluteFile());
		
		dodawanie();
		
	}
public static void dodawanie() throws IOException{
	
	String zawartosc = "Stefanka i Ja";
	
	BufferedWriter bw = new BufferedWriter(fw);
	
	bw.write(zawartosc);
	
	bw.close();
}
	
		
		
		
	}
	
	
	
	

