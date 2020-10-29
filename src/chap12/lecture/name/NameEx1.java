package chap12.lecture.name;

public class NameEx1 {
	public static void main(String[] args) {
		Thread th0 = Thread.currentThread();
		System.out.println(th0.getName());  //���� ������� �����尡 ���� main���� ����
		th0.setName("my Main Thread"); //�̸��� �������ִ� �޼ҵ�
		System.out.println(th0.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()); //���� ������� �ν��Ͻ��� �����
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				
				System.out.println(getName());
				
			}
		};
		t1.start(); //�̸��� �������� �ʾ� Thread-0 ���� ������� ����
		t2.start();
	}

}
