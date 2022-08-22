//Program Name: Array2DActivity.java  
//Author: Patricia Baker and Josh Decker
//Date: 3/11/2022
//Description: Exam scores are entered into a 2d array. The total exam scores are calculated, the average is calculated, and the total number of exam scores 
// above 70.0 is shown.  
package Ch7;


import java.util.Random;  
import java.text.DecimalFormat;

public class Array2DActivity
{
  public static void main(String[] args)
  {
		
		double average = 0.0;
		int countValues = 0;
		double sum = 0.0;
		Random gen = new Random();
		DecimalFormat dFmt = new DecimalFormat("0.0");
		
		// declare an array called myExams that holds 3 exams for 10 students
		// each row represents a student
		double[][] myExams = new double[10][3];

		System.out.println("2-D Array Activity");
		System.out.println("------------------\n");
		
		// load myExams array with the random numbers 60 - 100 to represent exam scores
		for (int i = 0; i  < myExams.length; i++) {
			for (int j = 0; j <myExams[i].length; j++) {
				myExams[i][j] = gen.nextDouble() * (100-60) + 60;
			}
		}
		
		//display all the components of the array
		System.out.println("Display the array\n");
		for (int i = 0; i  < myExams.length; i++) {
			for (int j = 0; j <myExams[i].length; j++) {
				System.out.print(dFmt.format(myExams[i][j]) + "\t");
			}
			System.out.println();
		}

		//add up all the element values in the array and display the sum
		for (int i = 0; i  < myExams.length; i++) {
			for (int j = 0; j <myExams[i].length; j++) {
				sum = sum + myExams[i][j];
			}
		}
 
		System.out.println("The sum of the array: " + dFmt.format(sum));

		//calculate and display the average
		average = sum / (myExams.length * myExams[0].length);
 
		System.out.println("The average exam score is: " + dFmt.format(average));
		
		
		
		//count and display how many exam scores are >= 70.0
		for (int i = 0; i  < myExams.length; i++) {
			for (int j = 0; j < myExams[i].length; j++) {
				if (myExams[i][j] >= 70.0) {
					countValues++;
				}
			}
		}

		System.out.println("Number of exams that are a C (70.0) or better: " + countValues);
		

  }
}

/*
2-D Array Activity
------------------

Display the array

72.0	77.1	62.0	
81.1	99.1	92.5	
93.5	89.2	78.0	
61.8	94.7	78.5	
64.6	94.8	78.4	
94.4	93.6	99.0	
77.7	98.8	86.8	
96.5	70.2	99.1	
74.6	92.2	77.0	
78.3	92.5	80.1	
The sum of the array: 2528.0
The average exam score is: 84.3
Number of exams that are a C (70.0) or better: 27
*/