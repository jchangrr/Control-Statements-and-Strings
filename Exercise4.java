import java.util.*;
public class Exercise4{
	public static void main(String[] args){

	// set up variables
	Scanner input = new Scanner(System.in);
	String grade = "Z";

	// ask for numeric percentage and calculate grade
	System.out.println("Please enter numeric percentage: ");
	double score = input.nextDouble();

	if (score >= 93.0)
		grade = "A";
	else if (score >= 90.0)
		grade = "A-";
	else if (score >= 88.0)
		grade = "B+";
	else if (score >= 84.0)
		grade = "B";
	else if (score >= 80.0)
		grade = "B-";
	else if (score >= 78.0)
		grade = "C+";
	else if (score >= 74.0)
		grade = "C";
	else if (score >= 70.0)
		grade = "C-";
	else if (score >= 68.0)
		grade = "D+";
	else if (score >= 64.0)
		grade = "D";
	else if (score >= 60.0)
		grade = "D-";
	else
		grade = "F";

	// output grade
	System.out.println("You entered " + score + "% your letter grade is " + grade);

	input.close();

	}
}