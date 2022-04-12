import java.util.*;
public class Exercise5{
	public static void main(String[] args){

	// set up variables
	Scanner input = new Scanner(System.in);
	String season = "Season";

	System.out.print("Enter month name: ");
	String month = input.next();

	month = month.toLowerCase();
	if (month.equals("december") || month.equals("january") || month.equals("february"))
		season = "Winter";
	else if (month.equals("march") || month.equals("april") || month.equals("may"))
		season = "Spring";
	else if (month.equals("june") || month.equals("july") || month.equals("august"))
		season = "Summer";
	else if (month.equals("september") || month.equals("october") || month.equals("november"))
		season = "Autumn";

	System.out.println("Season is: " + season);

	input.close();
	}
}