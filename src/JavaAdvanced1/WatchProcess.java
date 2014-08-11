package JavaAdvanced1;

import java.io.IOException;
import java.nio.file.*;

public class WatchProcess implements Runnable {

public WatchProcess(){
	Thread t1 = new Thread(this);
	t1.start();
}
	
	
	public void watcherProgram() throws IOException {
		WatchService watcher1 = FileSystems.getDefault().newWatchService();
		Path path1 = FileSystems.getDefault().getPath(
				"C:/Users/4/workspace/Copy");
		path1.register(watcher1, StandardWatchEventKinds.ENTRY_CREATE,
				StandardWatchEventKinds.ENTRY_MODIFY,
				StandardWatchEventKinds.ENTRY_DELETE);

		while (true) {
			try {
				WatchKey key = watcher1.take();
				for (WatchEvent<?> watchEvent : key.pollEvents()) {
					Path filename = (Path) watchEvent.context();
					WatchEvent.Kind<?> kind = watchEvent.kind();
					System.out.println(kind + ": " + filename);
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		try {
			watcherProgram();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
