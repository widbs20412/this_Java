package p05.secondary_stream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		DataInputStream ds = null;
		try {
			//상대경로 파일
			//FileInputStream fi = new FileInputStream("src/p05/secondary_stream/DataOutput.dat");
			//절대경로 파일1 : Window
			//FileInputStream fi = new FileInputStream("C:\\JavaSpace3\\Ch18__1_IO\\src\\p05\\secondary_stream/DataOutput.dat");
			//절대경로 파일2: Linux
			FileInputStream fi = new FileInputStream("C:/JavaSpace3/Ch18__1_IO/src/p05/secondary_stream/DataOutput.dat");
			ds = new DataInputStream(fi);
			while(true) {		
					int data = ds.readInt();	
					System.out.print(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		}catch (EOFException e) {
			System.out.println(" THE END");
		}catch (IOException e) {
			System.out.println("파일을 읽을수가 없습니다.");
		}
		try {
			ds.close();
		} catch (IOException e) {
			
		}
	}

}
