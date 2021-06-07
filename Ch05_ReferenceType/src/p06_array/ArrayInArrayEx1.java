package p06_array;

public class ArrayInArrayEx1 {

	public static void main(String[] args) {
		//p.162
		int[][] mathScores = new int[2][3];//2행 2열(2,3)
		System.out.println(mathScores.length);//2 : 2개 배열 각각 3개열이 들어 있음
		System.out.println(mathScores[0].length);//3 :첫번째 배열에 3개 열이 있다.
		System.out.println(mathScores[1].length);//3 :두번째 배열에 3개 열이 있다.
		
		//p.163
		int[][] Scores = new int[2][];//2행이면서 열이 정해지지 않음
		Scores[0] = new int[2];//길이(갯수)
		Scores[1] = new int[3];//길이(갯수)
		System.out.println(Scores.length);//2 : 2개 배열 각각 3개열이 들어 있음
		System.out.println(Scores[0].length);//2 :첫번째 배열에 2개 열이 있다.
		System.out.println(Scores[1].length);//3 :두번째 배열에 3개 열이 있다.
		
		//p.164
		System.out.println("-------------------");
		for(int i=0; i<mathScores.length; i++)//2행
			for(int k=0; k<mathScores[i].length; k++)//3열
			System.out.printf("mathScores["+i+"]["+k+"] =" +mathScores[i][k]+"\n");
		System.out.println("-------------------");
		
		//p.165
		System.out.println("-------------------");
				int[][] englishScores = new int[2][];//2행이면서 열이 정해지지 않음
				englishScores[0] = new int[2];//길이(갯수)
				englishScores[1] = new int[3];//길이(갯수)
				System.out.println(englishScores.length);//2 : 2개 배열 각각 3개열이 들어 있음
				System.out.println(englishScores[0].length);//2 :첫번째 배열에 2개 열이 있다.
				System.out.println(englishScores[1].length);//3 :두번째 배열에 3개 열이 있다.
				
				for(int i=0; i<englishScores.length; i++)//2행
					for(int k=0; k<englishScores[i].length; k++)//3열
					System.out.printf("englishScores["+i+"]["+k+"] =" +englishScores[i][k] +"\n");
				System.out.println("-------------------");
				
				
				System.out.println("-------------------");
				int[][] javaScores = {
						{95,80},
						{92,96,80}
				};
				for(int i=0; i<javaScores.length; i++)//2행
					for(int k=0; k<javaScores[i].length; k++)//3열
					System.out.printf("javaScores["+i+"]["+k+"] =" +javaScores[i][k]+"\n");
				System.out.println("-------------------");
	}

}
