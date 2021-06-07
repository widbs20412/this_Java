package p02.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
	Vector<String> v1 = new Vector();
	
	v1.addElement("삼성");
	v1.addElement("LG");
	v1.addElement("SK");
	v1.addElement("구글");
	System.out.println(v1);
	System.out.println("--------------");
	
	//for
//	for(String s : v1) {
//		System.out.println(s);
//	}
	for(int i=0; i<v1.size();i++)
		System.out.println(v1.elementAt(i));
	
	System.out.println("--------------");
	
	//elements()
	Enumeration<String> e = v1.elements();
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	for(Enumeration<String> e2 =v1.elements(); e2.hasMoreElements();)
		System.out.println(e2.nextElement());
	
	
	//iterator
	Iterator<String> it =v1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

}
