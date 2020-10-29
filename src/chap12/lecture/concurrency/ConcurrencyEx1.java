package chap12.lecture.concurrency;

public class ConcurrencyEx1 {
	static int field = 0;
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run(){
				for(int i = 0; i<100_0000;i++) {
					field++;
				}
				System.out.println(getName() + "����");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			public void run(){
				for(int i = 0; i<100_0000;i++) {
					field++;
				}
				System.out.println(getName() + "����");
				System.out.println(field);
			};
		};
		t1.start();
		t2.start();
		
//		t1�� t2�� field�� �����ϸ� ���ÿ� �����ҽ�
//		���൵�� ������ ���׹��� ���� field�� ���� �����ϱ� ���� �޸𸮿� ����ϴ�
//		��찡 �߻��� �� �ִ�
//		���� �����尣 �������� �����ϴ� ������ ������ ��
//		��밪�� ������ ���� �� ����
	}

}
