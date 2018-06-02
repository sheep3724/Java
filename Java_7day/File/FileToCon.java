package File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;


public class FileToCon{
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("c:/temp/input.txt");
		OutputStream output = System.out;
		int in = 0;
		while((in = input.read()) != -1) {
			output.write(in);
	
		}
	}
}