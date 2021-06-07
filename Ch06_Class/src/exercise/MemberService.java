package exercise;

public class MemberService {

	boolean login(String id,String password){
		
		if(id.equals("hong") && password.equals("12345"))
			return true;
		else 
			return false;
	
	}
	
	void logout(String logout) {
		System.out.println("로그아웃되었습니다.");
		System.out.println("Done");
	}
	
}
