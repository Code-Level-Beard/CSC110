//Program Name: BankAccount.java
//Author: Joshua Decker
//Class: CSC110AB
//Date Written: 4/11/2022
//Brief Description: BankAccount.java contains the constructor method, accessor/mutator methods, and a method to changes balance to a string. Updated with new parameters for ch10
package ch10;

import java.text.NumberFormat;

public class BankAccount {
		private static int count = 0;
		private double balance;
		private int acctNumber;
		private String name;
		private NumberFormat nFmt = NumberFormat.getCurrencyInstance();
		
		public BankAccount() {
			acctNumber = 0;
			name = "Unknown";
			balance = 0.00;
			count++;
		}
		
		public BankAccount(int acctNo, double userBalance,String userName) {
			acctNumber = acctNo;
			balance = userBalance;
			name = userName;
			count++;
		}
		
		public void setAcctNumber(int acctNo) {
			acctNumber = acctNo;
		}
		
		public void setName(String userName) {
			name = userName;
		}
		
		public int getAcctNumber() {
			return acctNumber;
		}
		
		public double getBalance() {
			
			return balance;
		}
		
		public String getName() {
			return name;
		}
		
		public static  int getCount() {
			return count;
		}
		
		public void deposit(double userDeposit) {
			balance += userDeposit;
		}
		
		public void withdraw(double userWithdraw) {
			balance -= userWithdraw;
		}
		
		public void withdraw(double amount, double fee) {
			balance -= (amount + fee);
		}
		
		public String toString() {
			return ("acctNumber: " + acctNumber + " balance : " + nFmt.format(balance) + " name : " + name );
		} 
	}

