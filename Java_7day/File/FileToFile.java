package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileToFile{
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("c:/temp/twice.jpg");
		FileOutputStream output = new FileOutputStream("newtwice2.jpg");
		int in = 0;
		while((in = input.read()) != -1) {
			output.write(in);
	
		}
	}
}