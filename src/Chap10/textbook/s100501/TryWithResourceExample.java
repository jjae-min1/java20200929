package Chap10.textbook.s100501;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new ArrayIndexOutOfBoundsException();       //�������ܹ߻�ó��
		}catch(Exception e) {
			System.out.println("���� ó�� �ڵ� �߻�");
		}
	}

}
