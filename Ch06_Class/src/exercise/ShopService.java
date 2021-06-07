package exercise;

public class ShopService {
	
	//최초의 한번 객체 생성
	private static ShopService s = new ShopService();
	
	//보안 : 다른 클래스에서 객체 생성 불능
	private ShopService() {
		
	}
	//생성된 객체를 호출
	static ShopService getInstance() {
		return s;
	}

}
