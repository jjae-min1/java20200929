package Chap09.textbook.exercises.no6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		String nickNamecopy = nickName;             
		Chat chat = new Chat(){
			@Override
			public void start() {
				System.out.println("[" + nickNamecopy + "]");
				//중첩클래스의 변수를 메소드에 사용하려면 최초선언된 값 그대로를 사용해야함
			}
		};
	}

}
