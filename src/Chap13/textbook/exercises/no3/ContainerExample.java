package Chap13.textbook.exercises.no3;



public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<>();
		container1.set("ȫ�浿", "����");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<>();
		container2.set("ȫ�浿", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
		System.out.println(name1 + " , " + job);
		System.out.println(name2 + " ," + age);
				
	}

}
