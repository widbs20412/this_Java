package p02.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
	Vector<Woman> v1 = new Vector();
	v1.add(new Woman("알파고", 20));	
	v1.add(new Woman("베타고", 30));
	
	System.out.println(v1);
	
	for(Woman w: v1)
		System.out.println(w);
	
	//elements()
		Enumeration<Woman> e = v1.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		for(Enumeration<Woman> e2 =v1.elements(); e2.hasMoreElements();)
			System.out.println(e2.nextElement());
		
		
		//iterator
		Iterator<Woman> it =v1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
