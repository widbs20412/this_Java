package p02.bytebased_input_outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//String[]이용하기
public class InputStreamEx2 {

	public static void main(String args[]) {
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream(args[0]);
			byte arr[] = new byte[16];
			while (true) {
				int data = fs.read(arr);
				if(data <0) break;//-1: end of file
				for(int i=0; i<data; i++)
				  System.out.print(arr[i]);
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
