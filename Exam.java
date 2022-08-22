//Program Name: Exam
//Author: Joshua Decker
//Class: CSC110
//Date Written: 1/31/2022
//Brief Description: Returns average of three exam scores that are input by user (manually entered into code per instructions obtained). 

package ch2;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args)
	{
		// declare variables
		int exam1, exam2, exam3;
		double average;
		int numberOfExams = 3;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first exam score: ");
		exam1 = scan.nextInt();
		
		System.out.print("Enter the second exam score: ");
		exam2 = scan.nextInt();
		
		System.out.print("Enter the third exam score: ");
		exam3 = scan.nextInt();
		
		average = (double)(exam1 + exam2 + exam3) / numberOfExams;
		
		System.out.print("The average exam score is: " + average);
		
	}

}

/* My output
 * Enter the first exam score: 90
* Enter the second exam score: 91
* Enter the third exam score: 100
* The average exam score is: 93.66666666666667
*/
