package p02.datatype;

public class DataTypeEx3 {

	public static void main(String[] args) {
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		System.out.println("END");
		
		//dangling else
		if(stop) 
			System.out.println("중지합니다.");
		else 
			System.out.println("시작합니다.");
		
		System.out.println("END");
		
		//dangling else
		if(stop) 
			System.out.println("중지합니다.");
		
			System.out.println("시작합니다.");
		    System.out.println("END");
		//dangling else
		if(stop) 
			System.out.println("중지합니다.");
		else {
			System.out.println("시작합니다.");	
		    System.out.println("END");
		    }

	}

}
