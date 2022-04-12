import java.util.*;
public class Exercise2{
	public static void main(String[] args){

	// set up variables
	Scanner input = new Scanner(System.in);

	// ask for two numbers
	System.out.print("Please enter a number: ");
	int n1 = input.nextInt();

	System.out.print("Please enter another number: ");
	int n2 = input.nextInt();

	// calculate max and display
	int maximum = Math.max(n1, n2);

	System.out.println("The maximum is " + maximum);

	input.close();

	}

}