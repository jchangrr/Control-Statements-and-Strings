import java.util.*;
public class Exercise3{
	public static void main(String[] args){

	// set up variables
	Scanner input = new Scanner(System.in);
	int rand_int = 97;

	// ask for letter input and validate
	System.out.println("Enter letter a to generate a random char (a-z), or enter letter A to generate a random char between (A-Z)");
	String c1 = input.nextLine();
	char c2 = c1.charAt(0);

	while (c2 != 'a' && c2 != 'A'){
		System.out.println("invalid entry, please try again");
		c1 = input.nextLine();
		c2 = c1.charAt(0);
	}


	// generate random char and output
	if (c2 == 'a') {
		rand_int = 97 + (int)(Math.random() * 26);
	}
	else {
		rand_int = 65 + (int)(Math.random() * 26);
	}

	System.out.println("Your random char is " + (char)rand_int);

	input.close();

	}
}