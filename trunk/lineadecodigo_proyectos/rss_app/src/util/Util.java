package util;

public class Util {

	public static boolean isLinux() {
		return System.getProperty("os.name").contains("x");
	}
	
}
