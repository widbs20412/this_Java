package p07_enums;

public class ClothingInfo2 {
	String code,name,material;
	Season season;
	
//TMI - 개발자 사이에서는 대문자 표시를 변수가 아닌 상수로 본다	
	/*
	 * static final int SPRING=1; //고정상수 : 값 변경 불가 static final int SUMMER=2; static
	 * final int FAIL=3; static final int WINER=4;
	 */
	
	public ClothingInfo2(String code, String name, String material, Season season) {
		super();
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

}
