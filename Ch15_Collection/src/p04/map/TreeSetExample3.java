package p04.map;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
	
		TreeSet<String> ts = new TreeSet<>();
		ts.add("apple");
		ts.add("forever");
		ts.add("description");
		ts.add("ever");
		ts.add("zoo");
		ts.add("base");
		ts.add("guess");
		ts.add("cherry");
		ts.add("c");
		ts.add("f");
		System.out.println(ts);
		NavigableSet<String> ns = ts.subSet("c", true, "f", true);
		for(String s : ns)
			System.out.println(s);
		System.out.println();
		
		for(int i=0; i<ns.size();i++)
			System.out.println(ns);
		
	}

}
