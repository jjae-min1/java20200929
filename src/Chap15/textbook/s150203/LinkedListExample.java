package Chap15.textbook.s150203;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		long startTime;
		long endTime;
		
//		Arraylist�� 1000�� ���� ���Խð�
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: " +(endTime-startTime) + " ns");
		
//		Linkedlist�� 1000�� ���� ���Խð�
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: " + (endTime-startTime) + " ns");
	}

}
