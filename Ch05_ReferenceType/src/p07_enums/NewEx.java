package p07_enums;
//enum 타입이 사용되기 전
public class NewEx {

	public static void main(String[] args) {
		//"1111" ,"반팔티셔츠" , "면100%",여름출력(숫자)
		
		ClothingInfo2 cl = new ClothingInfo2("1111" ,"반팔티셔츠" , "면100%",Season.SUMMER);
		System.out.println("상품코드" + cl.code);
		System.out.println("상품명" + cl.name);
		System.out.println("소재" + cl.material);
		System.out.println("계절구분" + cl.season);//2: enum을 사용전에 출력
	}

}
