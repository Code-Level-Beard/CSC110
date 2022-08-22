//Program Name: Bank.java - Creates BankAccount objects and CheckingAccount objects 
//Use in Inheritance discussion/assignment -Starting File
//Author:  P. Baker and Joshua Decker
//Date: 4/17/2022

//Brief Description:  Tests the BankAccount and CheckingAccount classes.
package ch12;

public class Bank
{
	public static void main( String [ ] args)
	{
		System.out.println("Welcome to our Bank");
		
		//create BankAccount object
		BankAccount myAcct = new BankAccount();
		System.out.println("\nA Bank Account");
		System.out.println("Beginning state of myAcct: " + myAcct.toString( ) );
		
		myAcct.deposit(100);		
		myAcct.withdraw(25);
		
		System.out.println("The balance of myAcct after deposit/withdraw : " + myAcct.getBalance( ) );
		
		
		System.out.println("\nA Checking Account");
		
		CheckingAccount studentAcct = new CheckingAccount();
		System.out.println("Beginning state of studentAcct: " + studentAcct.toString());
		
		studentAcct.deposit(50.00);
		System.out.println("State of studentAcct after deposit: " + studentAcct.toString());
		
		studentAcct.setTransactionFee(5.00);
		studentAcct.deposit(15.00);
		System.out.println("State of studentAcct after setting transaction fee and deposit: " + studentAcct.toString());
		
		System.out.println("Number of BankAccount objects created: " + BankAccount.getAcctCount());
		
		
	 	
	}


}//end of Bank

/*
Welcome to our Bank

A Bank Account
Beginning state of myAcct:  acctNumber 0 balance : $0.00 name : Unknown
The balance of myAcct after deposit/withdraw : 75.0

A Checking Account
Beginning state of studentAcct:  acctNumber 0 balance : $0.00 name : Unknown transaction fee = $1.00
State of studentAcct after deposit:  acctNumber 0 balance : $49.00 name : Unknown transaction fee = $1.00
State of studentAcct after setting transaction fee and deposit:  acctNumber 0 balance : $59.00 name : Unknown transaction fee = $5.00
Number of BankAccount objects created: 2
*/