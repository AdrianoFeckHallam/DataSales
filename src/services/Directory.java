package services;

abstract class Directory {
	
	private static String home = System.getProperty("user.home");
	private static String dirIn = "\\data\\in";
	private static String dirOut = "\\data\\out";

	public static String getHome() {
		return home;
	}

	public static String getDirIn() {
		return dirIn;
	}

	public static String getDirOut() {
		return dirOut;
	}	
}