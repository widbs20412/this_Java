package p06_array;

public class MainStringArrayArgument {

	public static void main(String args[]) {
		//예외처리 : 방법1
		/*
		 * if(args.length != 2) { System.out.println("배열의 입력이 2개여야 합니다.");
		 * System.exit(0); }
		 */
		
		
		//예외처리 : 방법2(try~catch)
		//try {
			String strNum1 = args[0];
			String strNum2 = args[1];
			
			//System.out.println("a");
			int num3 = Integer.parseInt(strNum1);//parseInt:문자열을 숫자로 바꿔준다 즉 Casting(형변환) String => int
			//System.out.println("b");
			int num4 = Integer.parseInt(strNum2);//parseInt:문자열을 숫자로 바꿔준다 즉 Casting(형변환) String => int
			int result = num3 + num4;
			System.out.println(result);
			/*
			 * } catch (NumberFormatException e) { System.out.println("문자열 숫자형을 입력해야합니다.");
			 * }catch (ArrayIndexOutOfBoundsException e) {
			 * System.out.println("배열의 길이에 문제가 있습니다."); }finally {//반드시 실행
			 * System.out.println("Done"); }
			 */
	}

}
