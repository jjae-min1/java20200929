package Chap15.lecture.list;
import java.util.*;

public class SetEx2Lotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			int num = getNumber();
			set.add(num);
			System.out.println(num);
		}
		
		System.out.println("size : " + set.size());
	}
	
	public static int getNumber() {
		return (int) (Math.random()*45) + 1;
	}

}
