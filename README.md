# Control-Statements-and-Strings
Exercise 1: Write a computer program that asks the user for a password and checks if the password is correct. If the password is valid, you display a message to the user saying “Valid Password”. Otherwise, you display the message “Invalid Password”. 
Assume that the valid password is “NYU42day”.

Exercise 2: Write a Java program that computes the maximum of two given numbers using Java.Lang.Math. You need to read the numbers from the console and display the maximum to the console.

Exercise 3: Write a Java program to ask the user to enter letter "a" to generate a random char (a-z) or letter “A” to generate a random char between (A-Z) . If the user enters anything else other than “a” or “A” the program will print message, "invalid entry, please try again".
Example:
Enter letter a to generate a random char (a-z) , or enter letter “A” to generate a random char between (A-Z) .
X
invalid entry, please try again
A
Your random chat is L.

Exercise 4: Write a Java program that calculates the letter grade given the numeric percent grade as an input by user.  Your output will look like the following:
You entered [numeric grade], Your letter grade is [letter grade]

Example:
Please enter numeric percentage: 
85  
You entered 85%, your letter grade is B

Exercise 5: Write a Java program that asks the user to enter the month name in any case (all caps, all small caps, mix caps) and the program will output the season. 

Input:
Enter month name: January ( user can enter case insensitive month name like jAnuaRy or JanUary, …etc)) 	

Output:
Season is: Winter 

Exercise 6:  Write a Java program that examine the user’s password strength as follows:
The program will ask the user to enter password.
Case #	Password rule -> program output	-> Example
Case 1	Password length is less that 8 characters (any character combination). -> Weak Password -> &g87A
Case 2	Password is 8-12 characters all numbers or all alphabets -> Medium Password -> 24730657739 or uuhUWhCQEL
Case 3	Password length is 8-12: all are small caps alphabet characters with more than one digit, or all upper caps alphabet characters with more than one digit. -> OK Password -> b0ma9wdelmut or  8MIWRT3OJ7S1
Case 4	Password is 8-12:  mix caps alphabet characters and at least one digit -> Strong Password	-> 71VS3aDgFkTe
Case 5	Password is more than 12 characters (any type of characters) -> Awesome password -> jR^x~u#ig@h0*{
Case 6	If anything else outside the above conditions	-> Invalid Password	

Exercise 7: Design a simple ATM service kiosk. This kiosk supports the following options for its menu: 
1.	View your account balance
2.	Deposit Cash
3.	Withdraw cash 
4.	Exit 
Enter your selection:

Your code should handle the following use cases:
-	If the user enters a selection that is not between 1-4, the ATM displays the message: “Incorrect selection, please try again”, then it displays the four selections again.
-	Initially, the account balance is $0.00. When you deposit money, this account balance is increased by your deposit amount. 
-	When you withdraw cash, this account balance is decreased by your withdrawal amount then displays the menu again.
-	You cannot withdraw more than what exists in the account, otherwise the ATM machine will display an error message “Sorry, you don’t have sufficient balance!” then displays the menu again.
-	You cannot withdraw negative cash amount, otherwise the ATM machine will display an error message “Incorrect Amount!” then displays the menu again. 
-	Similarly, you cannot deposit a negative cash amount, otherwise the ATM displays the message “Incorrect Amount!” then displays the menu again.
-	If the user enters 4, the ATM displays “Goodbye” and the program exists

