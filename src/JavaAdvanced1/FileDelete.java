package JavaAdvanced1;

import java.io.File;

public class FileDelete {

	
	 public void fileRemover() {
		 
		// dest = new File("C:/Users/4/workspace/Copy/experimentalFile"+i+".txt");
		 
		 
		 for(int i=0; i<= 10; i++){
		 
		    String fileName = "C:/Users/4/workspace/Copy/experimentalFile"+i+".txt";
		    // A File object to represent the filename
		    File f = new File(fileName);

		    // Make sure the file or directory exists and isn't write protected
		    if (!f.exists())
		      throw new IllegalArgumentException(
		          "Delete: no such file or directory: " + fileName);

		    if (!f.canWrite())
		      throw new IllegalArgumentException("Delete: write protected: "
		          + fileName);

		    // If it is a directory, make sure it is empty
		    if (f.isDirectory()) {
		      String[] files = f.list();
		      if (files.length > 0)
		        throw new IllegalArgumentException(
		            "Delete: directory not empty: " + fileName);
		    }

		    // Attempt to delete it
		    boolean success = f.delete(); 
		    //System.out.println("File was Deleted");

		    if (!success)
		      throw new IllegalArgumentException("Delete: deletion failed");
		  }
		
		}
}
	
	
	
	
	
	
	

