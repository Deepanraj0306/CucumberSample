package org.Datatable;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("arun");
		l.add("arun@gmail.com");
		l.add("chennai");
		String string = l.get(2);
		System.out.println(string);
	}

}
