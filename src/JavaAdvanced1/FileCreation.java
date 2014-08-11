package JavaAdvanced1;

import java.io.*;

public class FileCreation {

	File file;
	int fileContent;

	public void savingFiles() {

		String content = "Stefam";

		file = new File("C:/Users/4/workspace/experimentalFile.txt");
		try {
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 1; i <= 1000000; i++) {
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
