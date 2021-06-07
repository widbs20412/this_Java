package p05.secondary_stream;
//1037: Primitive Type I/O 보조 스트림 - DataInputstream, DataOutputStream
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//보조 스트림
//DataOutputStream : primitive type => Byte Stream 저장시 사용
public class DataOutputEx1 {

	public static void main(String[] args) {
		DataOutputStream ds = null;
		try {
			FileOutputStream fi = new FileOutputStream("DataOutput.dat");//주스트림
			ds = new DataOutputStream(fi);//보조 스트림
			
			int arr[]= {0,1,2,3,4,5,6,7,8,9};
			for(int i=0; i<arr.length; i++)
			
					ds.writeInt(arr[i]);
				
		} catch (FileNotFoundException e) {
			System.out.println("파이이 없습니다.");
		}catch (IOException e) {
			System.out.println("저장 또는 출력에 문제있습니다.");
		}

	}

}
