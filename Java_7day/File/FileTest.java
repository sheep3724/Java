package File;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		String f = "C:\\UU\\Java_7day";
		File file = new File(f);
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
	}
}
