package p01.charbased_reader_writer;
//1002
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 {
//maven.txt 파일내용 출력(Console)하기
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("maven.txt");
			while (true) {
				int data = fr.read();//a=97
				System.out.println(data);
				if(data == -1) break;//-1: end of file
				  char ch = (char) data;//a
				  System.out.println(ch);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("IO에 문제있습니다.");
		}
		try {
			fr.close();
		} catch (IOException e) {

		}

	}

}
