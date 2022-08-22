//Program Name: Even or Odd Counter
//Author: Joshua Decker
//Class: CSC110
//Date Written: 2/20/2022
//Brief Description: Receives input from a user, performs a loop to count evens and odds. Loop ends when a sentinel(0) num is entered. 
package ch4;

import java.util.Scanner;

public class EvenOrOddCounter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int value;
		int index = 1;
		int numEven = 0;
		int numOdd = 0;
		
		System.out.println("Even or Odd Counter");
		System.out.println("-------------------------");
		System.out.println("Please enter a series of integer values.  0 to quit.");
		System.out.print("Enter value " + index + ": " );
		value = scnr.nextInt();
		
		while (value != 0) {
			if (value % 2 == 0) {
				numEven = numEven +1;
			}
			else {
				numOdd = numOdd + 1;
			}
			
			index = index +1;
			
			System.out.print("Enter value " + index + ": " );
			value = scnr.nextInt();
			
		}
		
		System.out.println("\nThe results");
		System.out.println("-------------");
		
		if (index == 1) {
			System.out.println("No values entered.");
		}
		else {
			System.out.println("Total values entered: " + (index - 1));
			System.out.println("Even values entered: " + numEven);
			System.out.println("Odd values entered: " + numOdd);
			
			
			}
		}
		
	

	}

/* 
Even or Odd Counter
-------------------------
Please enter a series of integer values.  0 to quit.
Enter value 1: 1
Enter value 2: 2
Enter value 3: 3
Enter value 4: 4
Enter value 5: 5
Enter value 6: 6
Enter value 7: 7
Enter value 8: 8
Enter value 9: 9
Enter value 10: 0

The results
-------------
Total values entered: 9
Even values entered: 4
Odd values entered: 5 
*/
