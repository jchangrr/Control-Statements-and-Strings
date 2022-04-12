import java.util.*;
public class Exercise1 {
	public static void main(String[] args){
		
	// set up variables
	Scanner input = new Scanner(System.in);
	String password = "NYU42day";

	// ask for password
	System.out.print("Please enter password: ");
	String input_password = input.next();

	// validate password
	if (input_password.equals(password)) {
		System.out.println("Valid Password");
	}
	else {
		System.out.println("Invalid Password");
	}

	input.close();
	}
}