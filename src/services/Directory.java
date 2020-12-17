package services;

abstract class Directory {
	
	private static String home = System.getProperty("user.home");

	public static String getHome() {
		return home;
	}
}