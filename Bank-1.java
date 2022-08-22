//Program Name: Bank.java
//Author: Joshua Decker
//Class: CSC110AB
//Date Written: 4/11/2022
//Brief Description: Class that calls methods stored within BankAccount.java. Allows the user to create a new bank account. Allows the user to add or subtract from the balance and view the balance. This version has
//been updated with the new inputs for ch10.
package ch10;

import java.text.NumberFormat;

public class Bank {

	public static void main(String[] args) {
		BankAccount myAcct = new BankAccount();
		NumberFormat bFmt = NumberFormat.getNumberInstance();
		bFmt.setMaximumFractionDigits(2);
		bFmt.setMinimumFractionDigits(2);
		
		System.out.println("Welcome to our Bank");
		System.out.println();
		System.out.println("Beginning state of myAcct : " + myAcct.toString());
		myAcct.deposit(100.00);
		System.out.println("The balance of myAcct after deposit is : " + bFmt.format(myAcct.getBalance()));
		myAcct.withdraw(25.00);
		System.out.println("State of myAcct after deposit and withdraw : " + myAcct.toString());
		
		BankAccount studentAcct = new BankAccount();
		studentAcct.setName("Sue Student");
		studentAcct.setAcctNumber(1234);
		System.out.println("State of studentAcct : " + studentAcct.toString());
		studentAcct.deposit(200.00);
		studentAcct.withdraw(30.00);
		System.out.println("The balance of studentAcct after deposit/withdraw is : " + bFmt.format(studentAcct.getBalance()));
		System.out.println("State of myAcct: " + myAcct.toString());
		System.out.println("State of studentAcct: " + studentAcct.toString());
		
		BankAccount teacherAcct = new BankAccount(4444, 1500.00,"James Gosling");
		System.out.println("State of teacherAcct: " + teacherAcct.toString());
		teacherAcct.withdraw(50.00, 5.00);
		System.out.println("State of teacherAcct after withdraw : " + teacherAcct.toString());
		System.out.println("The Bank has " + BankAccount.getCount() + " accounts.");
		
		
		
		
		
		

	}

}

/*
Welcome to our Bank

Beginning state of myAcct : acctNumber: 0 balance : $0.00 name : Unknown
The balance of myAcct after deposit is : 100.00
State of myAcct after deposit and withdraw : acctNumber: 0 balance : $75.00 name : Unknown
State of studentAcct : acctNumber: 1234 balance : $0.00 name : Sue Student
The balance of studentAcct after deposit/withdraw is : 170.00
State of myAcct: acctNumber: 0 balance : $75.00 name : Unknown
State of studentAcct: acctNumber: 1234 balance : $170.00 name : Sue Student
State of teacherAcct: acctNumber: 4444 balance : $1,500.00 name : James Gosling
State of teacherAcct after withdraw : acctNumber: 4444 balance : $1,445.00 name : James Gosling
The Bank has 3 accounts.
*/
