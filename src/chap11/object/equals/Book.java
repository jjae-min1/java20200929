package chap11.object.equals;

public class Book {
	private int barCode;
	
	public Book (int barCode) {
		this.barCode = barCode;
	}
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return barCode;
//	}
//	
//	
//	@Override
//	public boolean equals(Object obj) {
//		Book o = (Book) obj;
//		
//		
//		return this.barCode == o.barCode;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())           //클래스가다르면
			return false;
		Book other = (Book) obj;                      //바코드가 다르면
		if (barCode != other.barCode)
			return false;
		return true;
	}

	
	

}
