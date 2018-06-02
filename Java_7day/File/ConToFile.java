package File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class ConToFile {
	public static void main(String[] args) throws IOException {
		InputStream input = System.in;
		FileOutputStream output = new FileOutputStream("c:/temp/result.txt");
		int in = 0;
		while((in = input.read()) != -1) {
			output.write(in);
	
		}
	}
}
