package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputEx3 {
//직렬화(Serializable)
	public static void main(String[] args) {
		ObjectOutputStream ot = null;
		try {
			FileOutputStream fs = new FileOutputStream("object2.dat");
			ot = new ObjectOutputStream(fs);
			BBSItem obj = new BBSItem("홍길동", "1234", "정모합시다", "이번주?");
			ot.writeObject(obj);
			System.out.println("전체 게시물의 수: "+ obj.itemNum);
			System.out.println("글쓴이: "+ obj.writer);
			System.out.println("PW: "+ obj.passwd);
			System.out.println("제목: "+ obj.title);
			System.out.println("내용: "+ obj.content);

		} catch (FileNotFoundException e) {
			System.out.println("날씨가 확인되지않습니다..");
		} catch (IOException e) {
			System.out.println("날씨를 확인할 수 없습니다.");
		}
		try {
			ot.close();
		} catch (IOException e) {
			
		}

	}

}
