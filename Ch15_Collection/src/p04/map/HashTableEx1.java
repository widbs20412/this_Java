package p04.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

//HashTable : Map계열,Synchronized 메소드로 구성
//비동기화 메소드 : HashMap
public class HashTableEx1 {

	public static void main(String[] args) {
		//Hashtable<String, String> h = new Hashtable<String, String>();
		Map<String, String> ht = new Hashtable<String, String>();

		ht.put("name", "홍길동");
		ht.put("age", "20");
		ht.put("address", "서울");
		System.out.println(ht);

		//방법1 : keySet(), iterator()
		Set<String> keySet = ht.keySet();
		Iterator<String> it2 = keySet.iterator();
		while (it2.hasNext()) {
			String key = it2.next();
			String value = ht.get(key);
			System.out.println("키1 : "+key +", 값 : " +value + " ");
		}

		//방법2 :  Enumeration<K> key()
		Enumeration<String> e = ((Hashtable<String, String>) ht).keys();

		while (e.hasMoreElements()) {
			String k = e.nextElement();
			String v = ht.get(k);
			System.out.println("키2" + k + ", 값 : " + v + " ");
		}
		//방법3 : 
		Vector<String> v = new Vector<>(ht.keySet());
		for (Enumeration<String> e2 = v.elements(); e2.hasMoreElements();) {
			String key = e2.nextElement();
			String value = ht.get(key);
			System.out.println("키3 : "+key +", 값 : " +value);
		}
	}

}
