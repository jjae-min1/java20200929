package Chap15.textbook.s150203;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		long startTime;
		long endTime;
		
//		Arraylist에 1000개 원소 삽입시간
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " +(endTime-startTime) + " ns");
		
//		Linkedlist에 1000개 원소 삽입시간
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
	}

}
