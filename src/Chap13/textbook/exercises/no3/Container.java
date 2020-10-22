package Chap13.textbook.exercises.no3;

public class Container <K, V>{
	K k;
	V v;
	
	public void set(K k, V v) {
		this.k = k;
		this.v = v;
	}
	
	
	
	public K getKey() {
		return k;
	}
	
	public V getValue() {
		return v;
	}

}
