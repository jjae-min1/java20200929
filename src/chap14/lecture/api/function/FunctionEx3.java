package chap14.lecture.api.function;
import java.util.*;
import java.util.function.*;
import java.io.*;


public class FunctionEx3 {
	public static void main(String[] args) throws Exception{
		String path = "src/chap14/lecture/api/function/FunctionEx3.java";
		FileReader fr = new FileReader(path);
		Map<Character, Integer> map = new HashMap<>();
		
		int ch;
		int i = 0;
		while((ch = fr.read()) != -1) {
			if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <'Z')) {
				char c = (char) ch;
				System.out.println(c);
				
				Character[] str = new Character[10000];
				
				
				str[i] = c;
				i++;
				for(Character key : str) {
					map.compute(key, (k,v) -> v == null ? 1 : v+1);
					
				}
			}
		}
		
		fr.close();
		System.out.println(map);
		
		
		  
	}

}
