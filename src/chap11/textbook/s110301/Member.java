package chap11.textbook.s110301;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //Ÿ�� ������ Ȯ��
			Member member = (Member) obj;
			if(id.equals(member.id)) { //���̵� ������ Ȯ��
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return id.hashCode(); 
		
	}

}
