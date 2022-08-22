/*
Program Name :  MultiplicationTable.java
Author :  Joshua Decker
Date : 2/28/2022
Class: CSC110AA/AB and CIS163AA
Description:
		  This program prompts the user for a number 1 - 5, 
		  checks for bad input,
		  and creates a multiplication table.
		  Student completes.
*/

package ch5;

import java.util.Scanner;

/* produces a multiplication table of integers */

public class MultiplicationTable {
	public static void main(String[] args) 
	{
		int size;
		int value;
		Scanner scan = new Scanner (System.in);

		//read in size of multiplication table
		System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
		size = scan.nextInt();
		
		while((size < 0) || (size > 5)) {
			System.out.println("Sorry, not a valid table size from 1 to 5. Try again.");
			System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
			size = scan.nextInt();
		}

		while ((size > 0) && (size <= 5)) {
			//using a for loop, display the top header row of numbers
			System.out.print("\t");
			for (int horiz = 1; horiz <= size; horiz++)
				{    System.out.print(horiz + "\t");    }

				System.out.println();

				//using a for loop, display the top header row underline (use a dash)
				System.out.print("\t");
				for (int horiz = 1; horiz <= size; horiz++)
					{    System.out.print("-" + "\t");		}

					System.out.println();
		
		
					/* using a nested for loop create the rest of the table */
				for (int vert = 1; vert <= size; vert++) {
						System.out.print(vert + ":\t");
						for (int i = 1; i <= size; i++) {
							value = vert * i;
							System.out.print(value + "\t");
						}
						System.out.println();
						}
				
				System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
				size = scan.nextInt();
				
				while ((size < 0) || (size > 5)) {
					System.out.println("Sorry, not a valid table size from 1 to 5. Try again.");
					System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
					size = scan.nextInt();
				}
					
				}
		
				
		System.out.println("\nDone!");
		} 
}

/*
Please enter the table size from 1 to 5 (0 to quit): -1
Sorry, not a valid table size from 1 to 5. Try again.
Please enter the table size from 1 to 5 (0 to quit): 1
	1	
	-	
1:	1	
Please enter the table size from 1 to 5 (0 to quit): 2
	1	2	
	-	-	
1:	1	2	
2:	2	4	
Please enter the table size from 1 to 5 (0 to quit): 5
	1	2	3	4	5	
	-	-	-	-	-	
1:	1	2	3	4	5	
2:	2	4	6	8	10	
3:	3	6	9	12	15	
4:	4	8	12	16	20	
5:	5	10	15	20	25	
Please enter the table size from 1 to 5 (0 to quit): 4
	1	2	3	4	
	-	-	-	-	
1:	1	2	3	4	
2:	2	4	6	8	
3:	3	6	9	12	
4:	4	8	12	16	
Please enter the table size from 1 to 5 (0 to quit): 0

Done!
*/