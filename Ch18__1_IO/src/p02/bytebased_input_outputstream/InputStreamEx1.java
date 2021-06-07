package p02.bytebased_input_outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream("output.dat");
			while (true) {
				int data = fs.read();
				if(data == -1) break;//-1: end of file
				System.out.print(data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("IO에 문제있습니다.");
		}
		try {
			fs.close();
		} catch (IOException e) {

		}

	}

}
