
public class Grade {

	private int number;
	private String letter;
	
	public Grade() {
		super();
		number = 0;
	}
	public Grade(int number) {
		super();
		this.number = number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	

//	public String convertGrade(int number) {
//		getNumber();
//		
//		if (number < 60) {
//			letter = "F";
//		} else if (number < 67) {
//			letter = "D";
//		} else if (number < 80) {
//			letter = "C";
//		} else if (number < 88) {
//			letter = "B";
//		} else {
//			letter = "A";
//		}
//		return letter;		
//	}
	
	
	public String getLetter() {
		String letter;
		if (number < 60) {
			letter = "F";
		} else if (number < 67) {
			letter = "D";
		} else if (number < 80) {
			letter = "C";
		} else if (number < 88) {
			letter = "B";
		} else {
			letter = "A";
		}
		return letter;		
	}
	
}
