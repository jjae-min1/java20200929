package chap12.lecture.anonymous;

public class AnonymousEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		
		};
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0;i < 5; i++) {
					System.out.println((char) ('a' + i));
					try {
						Thread.sleep(500);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				
			}
		});
		
		
		//���ٽ� Runnable�� �߻�޼ҵ� ���� ����
//		(�����ϰ����ϴ� �������̽��� Ŭ������ �޼ҵ尡 ��Ȯ�ҽ� ��������)
		Thread t3 = new Thread(() ->{  
			for(int i = 0; i < 5;i++) {
				System.out.println((char)('z'-i));
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}) ;
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
