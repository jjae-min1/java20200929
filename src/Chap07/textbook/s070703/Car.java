package Chap07.textbook.s070703;

import Chap07.textbook.s070702.Tire;

public class Car {
	
	Tire[] tires = {
			new Tire("�� ����",3),
			new Tire("�� ������",3),
			new Tire("�� ����",3),
			new Tire("�� ������",3)
	};
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		for(int i = 0; i< tires.length;i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}

	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
