package chap12.lecture.priority;

public class PriorityEx1 {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		
		for(int i = 0; i<threads.length; i++ ) {
			threads[i] = new Thread() { //�迭�� ������� ����
				public void run() {
					for(int i = 0; i < 20_0000_0000; i++) {
						
					}
					System.out.println(getName() + "�Ϸ�");
				}
			};
//			�켱��������
			if(i>10) {
				threads[i].setPriority(10);  //�������� �켱���� ����(0~10, �⺻�� 5)
			}else {
				threads[i].setPriority(1);
			}
		}
		
//		�켱������ ���� ���������
		
		for(Thread t : threads) {
			t.start();
		}
	}

}
