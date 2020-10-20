package Chap10.textbook.s100501;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new ArrayIndexOutOfBoundsException();       //碍力抗寇惯积贸府
		}catch(Exception e) {
			System.out.println("抗寇 贸府 内靛 惯积");
		}
	}

}
