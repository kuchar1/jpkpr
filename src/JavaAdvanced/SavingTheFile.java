package JavaAdvanced;

import java.io.*;

public class SavingTheFile {
	
File file;

	public static void main(String[] args) {
	
		SavingTheFile start = new SavingTheFile();
		start.savingFile();
		start.getFileInfo();
		
	}
	
	public void getFileInfo(){
		
		System.out.println("File name: " + file.getName());
		System.out.println("Patch: " + file.getAbsoluteFile());
		System.out.println("Total size: " + file.getUsableSpace());
			
	}
	public void savingFile(){
	String content = "This is the content to write into file";
	file = new File("C:\\Users\\4\\workspace\\jpkpr\\filename.txt");	
		try {
 			// if file doesnt exists, then create it
			//if (!file.exists()) {
			//	file.createNewFile();
			//}
 			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			//BufferedWriter bw = new BufferedWriter(fw);
			//bw.write(content);
			//bw.close();
			System.out.println("File was saved");
 		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileDelete(){
			
 		file.delete();
    	
 
    	}

	}
	
	
	

