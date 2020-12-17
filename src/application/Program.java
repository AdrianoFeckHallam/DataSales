package application;

import services.Watcher;

public class Program {
	
	public static void main(String[] args) {
		try {
			Watcher.loadigWatcher();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
