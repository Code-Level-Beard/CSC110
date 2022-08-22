package ch8;
//**********************************************************

//Ch 8 Program 1 Array Statistics 
//Program Name : ArrayStatistics.java  
//
//Author: PBaker and Joshua Decker
//Date Written : 
//Class: CSC110AB Online
//
//Brief Description:
//Uses a 1-D array to introduce user-defined methods and
//passing in array references and integer values.  
//Each method is a basic array task.  
//Students implement each given method stub 
//Students  create an overloaded calculate() method.  Must show it being used in output.
//**********************************************************

import java.util.Random;

public class ArrayStatistics {

	public static void main(String[] args) {
		// declare array to 20 exam scores
		int size = 20;
		int[] exams = new int[size];

		// fill the array with random values 50 - 100
		fillArray(exams);

		// Generate the report using your user-defined methods
		// Substitute your name in the Report Title
		System.out.println("***Array Statistics Report by Joshua Decker***");
		System.out.print("exams: ");
		displayArray(exams);
		System.out.println();
		System.out.println("max  : " + findMax(exams));
		System.out.println("min  : " + findMin(exams));
		System.out.println("total: " + calculateTotal(exams));
		System.out.println("avg  : " + calculate(exams));
		System.out.println("# of A exams: " + countGrades(90, 100, exams));
		System.out.println("# of B exams: " + countGrades(80, 89, exams));
		System.out.println("# of C exams: " + countGrades(70, 79, exams));
		System.out.println("# of D exams: " + countGrades(60, 69, exams));
		System.out.println("# of F exams: " + countGrades(0, 59, exams));
		System.out.println("Perfect score: " + (isGradeFound(100, exams) ? "Yes" : "No"));
		System.out.println("***Demonstrate the use of your overloaded calculate method  here***");
		System.out.println("Your exam scores are " + calculate(90, exams) + " an A.");
		System.out.println("\nEXTRA CREDIT HISTOGRAM");
		System.out.println("A: " + histogram(90, 100, exams));
		System.out.println("B: " + histogram(80, 89, exams));
		System.out.println("C: " + histogram(70, 79, exams));
		System.out.println("D: " + histogram(60, 69, exams));
		System.out.println("F: " + histogram(0, 59, exams));
	}

	// Students implement the following methods
	// fill the array with random numbers from 50 - 100
	public static void fillArray(int[] someArray) {
		Random rand = new Random();
		for (int i = 0; i < someArray.length; i++) {
			someArray[i] = rand.nextInt(51) + 50;
		}
	}

	// display the array as indicated in the example output below
	public static void displayArray(int[] someArray) {
		for (int i = 0; i < someArray.length; i++) {
			System.out.print(someArray[i] + " | ");
		}
	}

	// find and return the maximum value in the array
	public static int findMax(int[] someArray) {
		int max = someArray[0];

		for (int i = 0; i < someArray.length; i++) {
			if (someArray[i] > max) {
				max = someArray[i];
			}
		}
		return max;
	}

	// find and return the minimum value in the array
	public static int findMin(int[] someArray) {
		int min = someArray[0];
		for (int i = 0; i < someArray.length; i++) {
			if (someArray[i] < min) {
				min = someArray[i];
			}
		}
		return min;
	}

	// calculate and return the total of all values in the array
	public static int calculateTotal(int[] someArray) {
		int total = 0;

		for (int i = 0; i < someArray.length; i++) {
			total += someArray[i];
		}
		return total;
	}

	// count and return the number of exams that are >= lowGrade and <= highGrade
	public static int countGrades(int lowGrade, int highGrade, int[] someArray) {
		int total = 0;
		for (int i = 0; i < someArray.length; i++) {
			if ((someArray[i] >= lowGrade) && (someArray[i] <= highGrade)) {
				total++;
			}
		}
		return total;
	}

	// return true if someGrade is found in the array, otherwise return false
	public static boolean isGradeFound(int someGrade, int[] someArray) {
		boolean yesOrNo = false;
		for (int i = 0; i < someArray.length; i++) {
			if (someArray[i] == 100) {
				yesOrNo = true;
			}
		}
		return yesOrNo;
	}

	// calculate and return the average of all values in the array
	public static double calculate(int[] someArray)

	{
		double sum = 0;
		double average;
		for (int i = 0; i < someArray.length; i++) {
			sum += someArray[i];
		}
		average = sum / someArray.length;
		return average;
	}

	// ***student implementation of an overloaded method called calculate that
	// performs some calculation different than the method above. Students decide
	// what they want this method to do
	public static String calculate(int target, int[] someArray) {
		double sum = 0;
		double average;
		String result;

		for (int i = 0; i < someArray.length; i++) {
			sum += someArray[i];
		}
		average = sum / someArray.length;
		if (average >= 90.0) {
			result = String.format("%.2f", (average - 90.0)) + " points above";
		} else {
			result = String.format("%.2f", (90.0 - average)) + " points below";
		}
		return result;
	}
	
	//prints histogram based on a min/max scale using *
	public static String histogram(int lowGrade, int highGrade, int[] someArray) {
		int total = 0;
		String ast = "";
		for (int i = 0; i < someArray.length; i++) {
			if ((someArray[i] >= lowGrade) && (someArray[i] <= highGrade)) {
				total++;
			}
		}
		for (int j = 1; j <= total; j++) {
			ast += "*";
		}
		return ast;
	}
}

/*
***Array Statistics Report by Joshua Decker***
exams: 56 | 90 | 50 | 66 | 86 | 84 | 94 | 66 | 70 | 64 | 86 | 97 | 57 | 92 | 84 | 67 | 77 | 50 | 85 | 78 | 
max  : 97
min  : 50
total: 1499
avg  : 74.95
# of A exams: 4
# of B exams: 5
# of C exams: 3
# of D exams: 4
# of F exams: 4
Perfect score: No
***Demonstrate the use of your overloaded calculate method  here***
Your exam scores are 15.05 points below an A.

EXTRA CREDIT HISTOGRAM
A: ****
B: *****
C: ***
D: ****
F: ****
*/
