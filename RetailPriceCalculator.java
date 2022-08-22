package ch8;
//****************************************************************

//Ch 8 Program 1  Retail Price Calculator
//Program Name: RetailPriceCalculator.java
//
//Author:  PBaker and Josh Decker
//Date Written: 3/18/2022
//Class:  CSC110AB ONLINE
//
//Brief Description:  Using a user-defined method, calculate the retail 
//price of an item given the wholesale cost of the item and its markup percentage.  
//Introduces writing and using methods. 
//Also includes basic data validation (wholesale cost must be positive).
//*****************************************************************

import java.util.Scanner;

public class RetailPriceCalculator {

	public static double calculateRetailPrice(double wholesalePrice, double markupPercent) {
		double finalPrice = wholesalePrice + (wholesalePrice * (markupPercent * .01));
		return finalPrice;
	}

	public static void main(String[] args) {

		double wholesale;
		double markup;
		double retailPrice;
		char continueProgram = 'y';
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Retail Price Calculator");

		System.out.println("--------------------------------------");

		do {

			// prompt the user for the wholesale cost. Accept only positive values.
			System.out.print("Enter the item's wholesale price: ");
			wholesale = scnr.nextDouble();
			do {
				if (wholesale < 0) {
					System.out.print("Please re-enter a positve wholesale cost: ");
					wholesale = scnr.nextDouble();
				}
			} while (wholesale < 0);

			// prompt the user for the markup percentage
			System.out.print("Enter the item's markup percent: ");
			markup = scnr.nextDouble();

			// call the calculateRetailPrice method and display the retail price
			retailPrice = calculateRetailPrice(wholesale, markup);
			System.out.printf("The retail price is: " + "$%.2f", retailPrice);
			System.out.println("\n");

			// ask the user if they would like to continue or not
			System.out.print("Do you want to run another calculation? (Y or N): ");
			continueProgram = scnr.next().charAt(0);

		} while (continueProgram != 'n');

		System.out.println("\nGoodbye");
		scnr.close();

	}

}
/*
Welcome to the Retail Price Calculator
--------------------------------------
Enter the item's wholesale price: 5
Enter the item's markup percent: 100
The retail price is: $10.00

Do you want to run another calculation? (Y or N): y
Enter the item's wholesale price: 20
Enter the item's markup percent: 10
The retail price is: $22.00

Do you want to run another calculation? (Y or N): y
Enter the item's wholesale price: -50
Please re-enter a positve wholesale cost: 50
Enter the item's markup percent: 5
The retail price is: $52.50

Do you want to run another calculation? (Y or N): y
Enter the item's wholesale price: 400
Enter the item's markup percent: 25
The retail price is: $500.00

Do you want to run another calculation? (Y or N): n

Goodbye
*/
