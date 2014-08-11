package JavaAdvanced1;

import java.io.*;



public class IOCoping {
File source;
File dest;
	
	public void ioCoping() throws IOException{
		for (int i=0; i<=10; i++) {
		source = new File("C:/Users/4/workspace/experimentalFile.txt");
        dest = new File("C:/Users/4/workspace/Copy/experimentalFile"+i+".txt");
		InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
               
            }
        } finally {
            is.close();
            os.close();
        }
        //System.out.println("The file was copyied");
		}
	     
	}
	
	
	
	
	
}
