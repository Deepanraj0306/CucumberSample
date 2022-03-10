package org.Datatable;

import java.util.HashMap;
import java.util.Map;

public class Sample1D {
	public static void main(String[] args) {
		Map<String, String> m=new HashMap<>();
		m.put("name", "arun");
		m.put("email", "arun@gmail.com");
		m.put("city","chennai");
		String string = m.get("email");
		System.out.println(string);
	}

}
