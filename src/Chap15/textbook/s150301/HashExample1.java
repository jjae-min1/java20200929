package Chap15.textbook.s150301;

import java.util.*;

public class HashExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Iterator<String> iterator = set.iterator();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼¼ö :" + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("ºñ¾î ÀÖÀ½");}
		
	}
	
	

}
