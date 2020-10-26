package Chap15.textbook.exercises.p1607;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", "������"),
				new Member("�質��", "�����̳�"),
				new Member("�ſ��", "������")
				);

		List<Member> developers = new ArrayList<>();

		// �ۼ���ġ
		for(Member member : list) {
			String j = member.getJob();
			if(j.equals("������")) {
				developers.add(member);
			}
		}


		// ���
		for (Member member : developers) {
			System.out.println(member.getName());
		}
	}

}



