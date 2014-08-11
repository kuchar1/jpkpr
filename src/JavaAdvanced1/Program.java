package JavaAdvanced1;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		WatchProcess watcher = new WatchProcess();

		IOCoping copy = new IOCoping();
		FileDelete delete = new FileDelete();
		FileCreation start = new FileCreation();

		start.savingFiles();
		copy.ioCoping();
		delete.fileRemover();
	}
}
// http://www.journaldev.com/861/4-ways-to-copy-file-in-java w necie kopiowanie