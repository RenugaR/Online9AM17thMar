package com.stepdef;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		List<Map<String, String>> li = new ArrayList<Map<String, String>>();

		Map<String, String> mp = new LinkedHashMap<String, String>();
		System.out.println("Hello");
		System.out.println("Heelo");
		System.out.println("Hello");
		System.out.println("Hello");
		mp.put("Name", "raja");
		mp.put("email", "Raja12@gmail.com");
		int a = 10;
		int b = 23;
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Map<String, String> mp1 = new LinkedHashMap<String, String>();
		mp1.put("Name", "Karthik");
		mp1.put("email", "Karthik23@gmail.com");

		li.add(mp);
		li.add(mp1);

		Map<String, String> m = li.get(0);
		String string = m.get("Name");
		System.out.println(string);
	}
}
