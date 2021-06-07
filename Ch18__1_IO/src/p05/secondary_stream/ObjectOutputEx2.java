package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputEx2 {
//직렬화(Serializable)
	public static void main(String[] args) {
		ObjectOutputStream ot = null;
		try {
			FileOutputStream fs = new FileOutputStream("object.dat");
			ot = new ObjectOutputStream(fs);
			ot.writeObject(new GoodStock("현재 기온: ", 23));
			ot.writeObject(new GoodStock("강수 확률: ", 62));
			ot.writeObject(new GoodStock("바람: ", 2));
			
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
