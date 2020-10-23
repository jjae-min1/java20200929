package Chap15.textbook.s150201;

import java.util.List;
import java.util.ArrayList;

public class ArrayExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + size);
		System.out.println();
		
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++ ) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		
	}
	

}
