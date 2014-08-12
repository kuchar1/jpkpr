package JavaAdvanced2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;



public class ProgramStart {

	int i;
 public static void main(String[] args) throws InterruptedException, ExecutionException{
	 
	 ProgramStart pr1 = new ProgramStart();
	 FileGenerator fg1 = new FileGenerator();
	 fg1.savingFiles();
	 pr1.future();
	 
	 Thread t1 = new Thread();
	 t1.start();
	 
	 
 }
	
	public void future() throws InterruptedException, ExecutionException{
		Path file = Paths.get("C:/Users/4/workspace/experimentalFile.dat");
		
		try {
			AsynchronousFileChannel channel = AsynchronousFileChannel.open(file);
			ByteBuffer buffer = ByteBuffer.allocate(100_000);
			Future<Integer> result = channel.read(buffer, 0);
			
			while (!result.isDone()) {
				System.out.println(i++);
				
			}
			Integer bytesRead = result.get();
			System.out.println("Bytes read [" +bytesRead+"]");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
