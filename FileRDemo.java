
package ch11;
//Program Name : FileRDemo.java  Student starting File for Files Activity 1

//               Example of Reading from a file
//Author : P Baker and Josh Decker
//Date : 4/22/2022
//Brief Description:  We will use this starting file to show an example
//                    of reading and writing to stream files.
//
//IOExceptions are checked exceptions.  So either must catch or list
//in method header.  We chose the later.
//
//Using Eclipse note:  Create a Java package under src.  All files must be
//                     inside the same Java package.  In my example
//                     I created a package called ch10Files.  So the path 
//                     for all files will be src/ch10Files/~~~~

import java.io.*; //needed for FileReader
import java.util.Scanner;

public class FileRDemo {

	public static void main(String[] s) throws IOException {
		// declare and instantiate the input file object and open the file
		Scanner inFile = new Scanner(new FileReader("src/ch11/StudentGrades.txt"));
		PrintWriter outFile = new PrintWriter("src/ch11/GradeReport.txt");
		String line; // variable to put each line as read
		String name, firstName, firstNameAbbr, lastName;
		int exam1, exam2, exam3;
		double examAverage;

		/*
		 * use while because don't know how many lines in the file hasNextLine returns
		 * false when the end of the file is reached.
		 */
		outFile.println("Java Class Grade Report:");
		outFile.println("------------------------");

		while (inFile.hasNextLine()) {
			line = inFile.nextLine();
			Scanner tokens = new Scanner(line);
			tokens.useDelimiter(",");

			name = tokens.next();
			Scanner nameToken = new Scanner(name);
			nameToken.useDelimiter(" ");
			firstName = nameToken.next();
			lastName = nameToken.next();
			firstNameAbbr = firstName.charAt(0) + ".";
			exam1 = tokens.nextInt();
			exam2 = tokens.nextInt();
			exam3 = tokens.nextInt();
			tokens.close();
			nameToken.close();

			examAverage = (exam1 + exam2 + exam3) / 3.00;

			// write the same line back out to the console - we aren't doing anything too
			// fancy here
			System.out.println(line);
			
			//Use to test tokens and variables
			/*System.out.format("%.2f", examAverage);
			System.out.print(firstNameAbbr + " " + lastName);
			System.out.println();*/

			outFile.print(firstNameAbbr + " " + lastName + " has an exam average of ");
			outFile.format("%.2f", examAverage);
			outFile.println();

		}

		inFile.close();
		outFile.close();
		

	}
}

/*
 * Expected Output - nothing too fancy. Just displaying what was read from the
 * input file Donald Duck,90,80,90 Minnie Mouse,90,98,92 Homer Simpson,60,70,75
 */

/*
Java Class Grade Report:
------------------------
D. Duck has an exam average of 86.67
M. Mouse has an exam average of 93.33
H. Simpson has an exam average of 68.33
 */
