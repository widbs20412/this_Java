package exercise;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] str = {"10","2a"};
		int value=0;
		for(int i=0; i<str.length;i++) {
			
			try {
				value = Integer.parseInt(str[i]);
				System.out.println(value);
			} catch (NumberFormatException e) {
				System.out.println("숫자형 문자열이 필요합니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("숫자형 문자열이 필요합니다.");
			} catch (Exception e) {
				System.out.println("일반적 예외");
			}finally {
				
			}
			
		}
		System.out.println("Done");
	}

}
