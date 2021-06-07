package p05.search;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
//Search : TreeMap - 자동정렬, Map.Entry형태로 저장
//         부모키값과 비교해서 작으면 왼쪽, 크면 오른쪽 위치해서 저장
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(new Integer(87), new String("홍길동1"));
		tm.put(98, "이동수");
		tm.put(75, "이동수");
		tm.put(95, "신영권");
		tm.put(80, "김지영");
		
		System.out.println(tm);
		
		//NavigableMap<K,V>	descendingMap() : 내림차순으로 정렬된 Map.Entry의 Navigable리턴
		
		NavigableMap<Integer,String> nm = tm.descendingMap();
		Set<Map.Entry<Integer, String>> des = nm.entrySet();//쌍으로? 꺼낸다?
		
		for (Map.Entry<Integer, String> entry : des)
			System.out.print(entry.getKey()+" : "+entry.getValue());
		
		//오름차순
		NavigableMap<Integer,String> am = nm.descendingMap();
		Set<Map.Entry<Integer, String>> aes = am.entrySet();//쌍으로? 꺼낸다?
		
		for (Map.Entry<Integer, String> entry : aes)
			System.out.print(entry.getKey()+" : "+entry.getValue());
		
	}

}
