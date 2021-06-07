package p04.map;

import java.util.Enumeration;
import java.util.Properties;
public class PropertiesEx2 {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		p.put("name","홍길동");
		Enumeration<?>enu = p.propertyNames();
		while(enu.hasMoreElements()) { 
			String key = (String) enu.nextElement();
			String value = p.getProperty(key);
			System.out.println(key + " : "+ value);
		}
		System.out.println(p.getProperty("user.home"));

	}

}
