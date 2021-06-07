package study12;

import java.util.ArrayList;
import java.util.List;



public class MemberSetData {
	//Bean에 데이터 저장방법1
	
	public MemberBean setData() {//홍길동
		ArrayList<MemberBean> mb1 = new ArrayList<MemberBean>();
		mb1.add(new MemberBean("hong",1234,"홍길동"));
		return mb1.get(0);	
	}
	
	public List<MemberBean> setDatas(){//이순신, 김창수
		List<MemberBean> mb2 = new ArrayList<MemberBean>();
		mb2.add(new MemberBean("abcd",3333,"이순신"));
		mb2.add(new MemberBean("admin",1111,"김창수"));
		return mb2;
		
//		List<MemberBean> mb3 = new ArrayList<MemberBean>();
//		mb3.add(new MemberBean("admin",1111,"김창수"));
//		return null;
		
		
	}
	
	
	
	
}
