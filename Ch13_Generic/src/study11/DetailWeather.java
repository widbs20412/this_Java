package study11;

public class DetailWeather extends Weather{
    String dust; //미세먼지 농도
    String direction; //풍향

    //날씨 상세 정보
    public void  info(int a) {
    	super.info();//weather info랑 서로 달라요 재정의 아님!!
    	System.out.println("미세먼지 농도 :" + dust + "%");
    	System.out.println("풍향 :" + direction + "%");
    }
}
