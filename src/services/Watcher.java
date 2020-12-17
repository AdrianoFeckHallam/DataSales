package services;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Watcher extends Directory {
	
	public static void loadigWatcher() throws InterruptedException {
		try {
			WatchService watcher = FileSystems.getDefault().newWatchService();
			
			String pathToDir = getHome() + "\\data\\in";
			
			Path directory = Paths.get((pathToDir));
			directory.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
			
			WatchKey key;
			boolean first = true;
			while (true) {
				if (first) {
					first = false;
					Writer.getWriter();
				}

				key = watcher.take();
			
				Writer.getWriter();
				
				boolean valid = key.reset();
				if (!valid) {
					break;
				}
			}
			watcher.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
