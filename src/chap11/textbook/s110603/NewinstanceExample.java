package chap11.textbook.s110603;

public class NewinstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("chap11.textbook.s110603.SendAction");
			Action action = (Action) clazz.newInstance(); //SendAction�ν��Ͻ� ����
			action.execute(); //�������̽��� execute�޼ҵ带 SendAction �ν��Ͻ��� ����
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InstantiationException e) { // �� �ϰ��� �ϴ� Ŭ������ �߻�Ŭ���� or �������̽�
			e.printStackTrace();
		}catch(IllegalAccessException e) { // �����ڿ� ���� ����
			e.printStackTrace();
		}
	}

}




