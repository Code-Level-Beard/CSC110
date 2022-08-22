//Program Name: Username Generator
//Author: Joshua Decker
//Class: CSC110
//Date Written: 2/12/2020
//Brief Description: Generates a two unique usernames based on input from user. 
package ch3;

import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random gen = new Random();
		String firstName, lastName, birthYear, username1, username2;
		
		System.out.println("Welcome. This program will help you create a username.");
		
		System.out.println("Enter your first name: ");
			firstName = scnr.nextLine();
		
		System.out.println("Enter your last name:");
			lastName = scnr.nextLine();
			
		System.out.println("Enter four digit birthyear:");	
			birthYear = scnr.nextLine();
			
		username1 = firstName.charAt(1) + "$" + birthYear.substring(2, 4) + lastName.toUpperCase() + (gen.nextInt(100 ) + 1);
		username2 = firstName.substring(0,2) + firstName.length() + "$" + lastName.substring(lastName.length() - 2, lastName.length()) + (gen.nextInt(26) + 50);
		
		System.out.println("Here are the two possible usernames generated for you: ");
		System.out.println("Username1: " + username1 + " Length: " + username1.length());
		System.out.println("Username2: " + username2 + " Length: " + username2.length());
		

	}

}

/*Welcome. This program will help you create a username.
Enter your first name: 
Joshua
Enter your last name:
Decker
Enter four digit birthyear:
1988
Here are the two possible usernames generated for you: 
Username1: o$88DECKER44 Length: 12
Username2: Jo6$er65 Length: 8 */
