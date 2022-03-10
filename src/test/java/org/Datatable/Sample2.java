package org.Datatable;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
	public static void main(String[] args) {
		List<ArrayList<String>> l=new ArrayList<ArrayList<String>>();
		
		ArrayList<String> a=new ArrayList<>();
		a.add("arun");
		a.add("arun@gmail.com");
		a.add("chennai");
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Bala");
		a1.add("Bala@gmail.com");
		a1.add("Cochin");
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("Babu");
		a2.add("Babu@gmail.com");
		a2.add("Trichy");
		
		l.add(a);
		l.add(a1);
		l.add(a2);
		
		ArrayList<String> arrayList = l.get(1);
		String string = arrayList.get(1);
		System.out.println(string);
		
		String string2 = l.get(1).get(2);
		System.out.println(string2);
	}

}
