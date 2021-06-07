package exercise;

public class LoginExample {

	public static void main(String[] args) {

		try {
			login("white", "12345");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		try {

			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}

	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");// Checked Exception
		}

		if (!password.equals("12345")) {
			throw new WrongPasswordException("Password가 틀립니다.");// 1단계
		}
	}

}
