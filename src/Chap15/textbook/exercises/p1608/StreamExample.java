package Chap15.textbook.exercises.p1608;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		Map<String, List<String>> groupingMap = new HashMap<>();
		// �ۼ���ġ
	
		for(Member member : list) {
			String job = member.getJob();
			String name = member.getName();
			
			List<String> names = groupingMap.get(job);
			if(names == null) {
				List<String> newList = new ArrayList<>();
				newList.add(name);
				groupingMap.put(job, newList);
			}else {
				names.add(name);
			}
			
		}
		
		// ���
		List<String> developers = groupingMap.get("������");
		List<String> designers = groupingMap.get("�����̳�");

		System.out.print("[������]");
		for (String name : developers) {
			System.out.print(" " + name);
		}
		System.out.println();

		System.out.print("[�����̳�]");
		for (String name : designers) {
			System.out.print(" " + name);
		}
	}

}


