//Program Name: FamousCS.java
//Author: Joshua Decker
//Class: CSC110AB
//Date Written: 4/22/2022
//Brief Description: Reads information from names.txt and outputs information with new formatting into a new file, CSReport.txt
package ch11;

//required imports
import java.io.*; 
import java.util.Scanner;

public class FamousCS {

	public static void main(String[] args) throws IOException {
		//global variables 
		Scanner inFile = new Scanner(new FileReader("src/ch11/names.txt"));
		PrintWriter outFile = new PrintWriter("src/ch11/CSReport.txt");
		String line, firstName, firstNameAbbr, lastName, claimToFame;
		int count = 0;

		//Reads inFile line by line and delimits data into separate variables
		while (inFile.hasNextLine()) {
			line = inFile.nextLine();
			Scanner lineToken = new Scanner(line);
			lineToken.useDelimiter(",");
			lastName = lineToken.next();
			firstName = lineToken.next();
			firstNameAbbr = firstName.charAt(0) + ".";
			claimToFame = lineToken.next();
			lineToken.close();
			count++;
			
			//outputs information to console
			System.out.println(firstNameAbbr + " " + lastName + " " + claimToFame + ".");
			
			//writes previous console output to outFile
			outFile.println(firstNameAbbr + " " + lastName + " " + claimToFame + "."); 
		
		}
		 
		System.out.println("There are " + count + " famous computer scientists in the file.");
		outFile.println("There are " + count + " famous computer scientists in the file.");
		
		//close access to files
		inFile.close();
		outFile.close();

	}

}

/*
A. Easley worked at NASA on the software team for the Centaur rocket.
J. Gosling is often called the inventor of Java.
E. Dijkstra was the supreme algorithmist - he researched and developed how to solve problems fast.
A. Kay developed the first OO programming language called Smalltalk.
S. Goldwasser won the Turing Award for her work in cryptography.
A. Turing is often considered the father of modern computer science.
J. Backus developed the Fortran language with his team at IBM.
D. Knuth wrote the ultimate Computer Science comprehensive text called The Art of Computer Programming.
J. McCarthy is famous for his contributions to and coined the term Artificial Intelligence.
G. Hopper was a Navy Admiral who invented the first compiler.
J. von Neumann developed the von Neumann architecture used in virtually every non-parallel processing computer.
T. Berners-Lee is an English computer scientist best known as the inventor of the World Wide Web.
K. Thompson worked at Bell Labs for most of his career where he designed and implemented the original Unix operating system.
G. van Rossum is a Dutch programmer best known as the creator of the Python programming language .
B. Liskov won the Turing Award for her contributions to the design of computer programming languages.
D. Ritchie is best known as the creator of the C programming language.
V. Cerf is recognized as one of fathers of the internet.
T. Hoare he is best known for the development of Quicksort which is a widely used sorting algorithm.
A. Shamir a co-inventor of the Feige–Fiat–Shamir identification scheme and is one of the inventors of differential cryptanalysis.
M. Hamilton is credited with having coined the term software engineering while developing the guidance and navigation system for the Apollo spacecraft as head of the Software Engineering Division of the MIT Instrumentation Laboratory.
There are 20 famous computer scientists in the file.
*/
