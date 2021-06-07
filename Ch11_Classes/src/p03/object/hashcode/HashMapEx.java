package p03.object.hashcode;

import java.util.HashMap;
//HashMap: 자료가 key, Value쌍으로 되어 있는 자료, HashCode 사용
public class HashMapEx {

	public static void main(String[] args) {
		//우리가 만든 클래스가 있는 경우 반드시 : HashMap을 사용하는 경우 반드시 ,재정의(hashCode(), equals())
        HashMap<Name, Integer> hashtable = new HashMap<Name, Integer>();
        hashtable.put(new Name("길동","홍"), new Integer(90));
        hashtable.put(new Name("알파","고"), new Integer(80));
        Integer num = hashtable.get(new Name("길동","홍"));
        System.out.println("홍길동의 성적은? "+num);
        
        //개발자가 만들어 놓은 Class인 경우: hashCode(),equals() 재정의 생략
        HashMap<String, Integer> hashtable2 = new HashMap<String, Integer>();
        hashtable2.put(new String("홍길동"), new Integer(90));
        hashtable2.put(new String("알파고"), new Integer(80));
        Integer num2 = hashtable2.get(new String("알파고"));
        System.out.println("홍길동의 성적은? "+num2);
	}

}
