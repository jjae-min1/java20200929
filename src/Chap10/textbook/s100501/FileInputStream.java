package Chap10.textbook.s100501;

public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws ArrayIndexOutOfBoundsException {
		System.out.println(file + "�� �ݽ��ϴ�.");
		
	}

}
