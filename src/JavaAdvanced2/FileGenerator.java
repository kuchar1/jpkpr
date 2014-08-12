package JavaAdvanced2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

	
	File file;
	int fileContent;

	public void savingFiles() {

		String content = "Stefam";

		file = new File("C:/Users/4/workspace/experimentalFile.dat");
		try {
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 1; i <= 10000000; i++) {
				bw.write(content + i + "/");
			}
			bw.close();
			//System.out.println("File was saved");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
