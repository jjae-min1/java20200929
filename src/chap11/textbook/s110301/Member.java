package chap11.textbook.s110301;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //타입 같은지 확인
			Member member = (Member) obj;
			if(id.equals(member.id)) { //아이디 같은지 확인
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
