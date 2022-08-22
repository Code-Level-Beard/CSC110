//Program Name: CellPhoneBillReport
//Author: Patricia Baker and Joshua Decker
//Class: CSC110
//Date Written: 3/5/2022
//Brief Description: Program displays a report that includes the customer name, year, highest bill, the number of bills over a set amount,  lowest bill,
//and the total annual bill for a cell phone customer, 
package ch6;

import java.text.NumberFormat;
import java.util.Scanner;

public class CellPhoneBillReport {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		String name= "";
		String year = "";
		//Monthly cell phone bills in dollars
		double[] cellPhoneBill = {45.24, 54.67, 43.66, 55.32, 67.19, 44.61, 
				                  65.29, 49.75, 43.21, 44.67, 56.99, 64.34};
		//corresponding months
		String[] month =         {"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
				                  "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
		double highestBill = cellPhoneBill[0];
		double lowestBill = cellPhoneBill[0];
		double totalBill = 0;
		int countHigh = 0;
		double highMark = 50.00;
		
		
		System.out.println("Welcome Valued Customer");
		System.out.print("Please enter your name: ");
		name = scnr.next();
		System.out.print("Please enter the year: ");
		year = scnr.next();
		
		//find the highest  bill
		for (int i = 0; i  < month.length; i++) {		
			if (cellPhoneBill[i] > highestBill) {
				highestBill = cellPhoneBill[i];
			}
		}
		
		//find the lowest  bill
		for (int i = 0; i < month.length; i++) { 
			if (lowestBill > cellPhoneBill[i]) {
				lowestBill = cellPhoneBill[i];
			}
		}
		
		//find the number of monthly bills above the highMark 
		for (int i = 0; i < month.length; i++) {			
			if(cellPhoneBill[i] >= highMark) {
				countHigh++;
			}
		}
		
		//determine annual total bill
		for (int i = 0; i < month.length; i++) {		
			totalBill = totalBill + cellPhoneBill[i];
		}
		
		//display report title and dashes (adjusts based on name)
		System.out.println("\nAnnual Cell Phone Report for " + name);
		for(int x = 0; x < name.length() + 29; x++) 
			System.out.print("-"); 
		
		System.out.println();
		
		//display month and corresponding  bill amounts
		for (int i = 0; i < month.length; i++) {			 
			System.out.println(month[i] + ": \t" +  cFmt.format(cellPhoneBill[i]));
		}
		
		System.out.println();
				
		//display results - see example in assignment
		System.out.println("Monthly bills >$50.00: " + countHigh);
		System.out.println("Highest monthly bill  : " + cFmt.format(highestBill));
		System.out.println("Lowest monthly bill  : " + cFmt.format(lowestBill));
		System.out.println("Annual bill for " + year + "  : " + cFmt.format(totalBill));
		
		
		
		//display dashes
		for(int x = 0; x < name.length() + 29; x++) 
			System.out.print("-"); 
		
		System.out.println();
		
		scnr.close();

	}

}

/* 
Welcome Valued Customer
Please enter your name: Josh
Please enter the year: 2022

Annual Cell Phone Report for Josh
---------------------------------
JAN: 	$45.24
FEB: 	$54.67
MAR: 	$43.66
APR: 	$55.32
MAY: 	$67.19
JUN: 	$44.61
JUL: 	$65.29
AUG: 	$49.75
SEP: 	$43.21
OCT: 	$44.67
NOV: 	$56.99
DEC: 	$64.34

Monthly bills >$50.00: 6
Highest monthly bill  : $67.19
Lowest monthly bill  : $67.19
Annual bill for 2022  : $634.94
---------------------------------
*/

