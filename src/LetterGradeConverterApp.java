
public class LetterGradeConverterApp {

	public static void main(String[] args) {
		String choice = "y";
		Console.printWelcome();
		
		while (choice.equalsIgnoreCase("y")) {
			int numbGrade = Console.getIntWithinRange("Enter numerical grade: ", -1, 101);
			Grade myGrade = new Grade(numbGrade);
			myGrade.setNumber(numbGrade);
			System.out.println("The Letter Grade: " + myGrade.getLetter());	
			
			choice = Console.getChoiceString("Continue(y/n)? ", "y", "n");
		}
		
		System.out.print("Have a nice day!");
		
	}

}
