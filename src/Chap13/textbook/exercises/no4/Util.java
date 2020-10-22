package Chap13.textbook.exercises.no4;

public class Util {
	public static <K, V> V getValue(Pair<K, V>p1, String s){
		Pair<K, V> p2 = (Pair<K, V>) p1;
		K key = p2.getKey();
		V value = p2.getValue();
		String key2 = s;
		if(key.equals(key2)) {
			return value;
		}else {
			return null;
		}
	}

}
