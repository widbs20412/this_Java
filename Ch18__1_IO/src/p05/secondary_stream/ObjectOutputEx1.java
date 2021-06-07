package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputEx1 {
//직렬화(Serializable)
	public static void main(String[] args) {
		ObjectOutputStream ot = null;
		try {
			FileOutputStream fs = new FileOutputStream("objectOutput.dat");
			ot = new ObjectOutputStream(fs);
			ot.writeObject(new GregorianCalendar(2021,06,07));
			ot.writeObject(new GregorianCalendar(2021,06,8));
			ot.writeObject(new GregorianCalendar(2021,06,9));

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 출력 할 수가 없습니다.");
		}
		try {
			ot.close();
		} catch (IOException e) {
			
		}

	}

}
