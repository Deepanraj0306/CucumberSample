package org.Datatable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Sample2D {

	public static void main(String[] args) {
		
		List<LinkedHashMap<String, String>> l=new ArrayList<LinkedHashMap<String,String>>();
		
		LinkedHashMap<String, String> m=new LinkedHashMap<>();
		m.put("Name", "Arun");
		m.put("email", "Arun@gmail.com");
		m.put("city", "chennai");
		
		LinkedHashMap<String, String> m1=new LinkedHashMap<>();
		m1.put("Name", "Babu");
		m1.put("email", "Babu@gmail.com");
		m1.put("city", "cochin");
		
		LinkedHashMap<String, String> m2=new LinkedHashMap<>();
		m2.put("Name", "Bala");
		m2.put("email", "Bala@gmail.com");
		m2.put("city", "Trichy");
		
		l.add(m);
		l.add(m1);
		l.add(m2);
		
		LinkedHashMap<String, String> linkedHashMap = l.get(1);
		String string = linkedHashMap.get("Name");
		System.out.println(string);
		
		String string2 = l.get(2).get("city");
		System.out.println(string2);
		
	}
}
