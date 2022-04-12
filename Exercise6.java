import java.util.*;
public class Exercise6{
	
	// create method for case 1
	public static boolean caseOne(String password){
		if (password.length() < 8){
			return true;
		}
		else
			return false;
	}

	// create method for case 2
	public static boolean caseTwo(String password){
		int digitCount = 0;
		int letterCount = 0;
		for (int i = 0; i < password.length(); i++){
			if (Character.isLetter(password.charAt(i)) == true){
				letterCount++;
			}
			else if (Character.isDigit(password.charAt(i)) == true){
				digitCount++;
			}
		}
		if (letterCount > 0 && digitCount > 0 || letterCount + digitCount != password.length())
			return false;
		else 
			return true;

	}

	// create method for case 3
	public static boolean caseThree(String password){
		int digitCount = 0;
		int upperCount = 0;
		int lowerCount = 0;
		for (int i = 0; i < password.length(); i++){
			if (Character.isLowerCase(password.charAt(i)) == true){
				lowerCount++;
			}
			else if (Character.isUpperCase(password.charAt(i)) == true)
				upperCount++;
			else if (Character.isDigit(password.charAt(i)) == true)
				digitCount++;
		}
		if (digitCount == 0)
			return false;
		else if (upperCount > 0 && lowerCount > 0)
			return false;
		else if (upperCount + lowerCount + digitCount != password.length())
			return false;
		else
			return true;
	}

	// create method for case 4
	public static boolean caseFour(String password){
		int digitCount = 0;
		int upperCount = 0;
		int lowerCount = 0;
		for (int i = 0; i < password.length(); i++){
			if (Character.isLowerCase(password.charAt(i)) == true){
				lowerCount++;
			}
			else if (Character.isUpperCase(password.charAt(i)) == true)
				upperCount++;
			else if (Character.isDigit(password.charAt(i)) == true)
				digitCount++;
		}
		if (upperCount + lowerCount + digitCount != password.length())
			return false;
		else if (digitCount > 0 && upperCount > 0 && lowerCount > 0){
			return true;
		}
		else 
			return false;
	}

	// create method for case 5
	public static boolean caseFive(String password){
		if (password.length() > 12){
			return true;
		}
		else
			return false;
	}

	// evaluate password strength
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a password: ");
		String password = input.next();

		if (caseOne(password) == true){
			System.out.println("Weak Password");
		}
		else if (caseFive(password) == true){
			System.out.println("Awesome Password");
		}
		else if (caseTwo(password) == true){
			System.out.println("Medium Password");
		}
		else if (caseThree(password) == true){
			System.out.println("OK Password");
		}
		else if (caseFour(password) == true){
			System.out.println("Strong Password");
		}
		else
			System.out.println("Invalid Password");
	input.close();
	}
}