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
				//��øŬ������ ������ �޼ҵ忡 ����Ϸ��� ���ʼ���� �� �״�θ� ����ؾ���
			}
		};
	}

}
