/* Class Name: The BankAccount class - Base/Super class 
   Use in Inheritance Discussion/Assignment
   Author:  P Baker
   Date : 
   Brief Description: A Basic BankAccount class/blueprint
 */
package ch12;



import java.text.NumberFormat;

class BankAccount 
{

    protected int acctNumber;   //changed from private to protected to give hierarchy access
    protected double balance;
    protected String name;

    private static int acctCount= 0;  //not an instance variable, but a class variable (static)

    /** constructs a bank account with zero balance, zero account number
        and name set to Unknown

     */

    public BankAccount() {
		 acctNumber = 0;
		 balance = 0.0;
		 name = "Unknown";

		 acctCount++;  //increment when object created
 	}

 	/*
 	  constructs a bank account with an account number, an  initial balance, and
 	  an owner!
 	 */

 	public BankAccount(int acctNo, double initBalance, String owner) {
		acctNumber = acctNo;
		balance = initBalance;
		name = owner;

		acctCount++;   //increment when object created
 	}


    //all of the mutator methods - set

    public void setAcctNumber(int acct)
	 {
		    acctNumber = acct;
    }

  //DO NOT IMPLEMENT setBalance.  Don't want accounts
  //to be able to set a balance.  Use deposit or withdraw methods
   
    public void setName(String someName)
	 {
		name = someName;
    }

	//all of the accessor methods - get
   
	public int getAcctNumber()
	{
	    return acctNumber;
    }

    public double getBalance()
	 {
        return balance;
    }

    public String getName()
	 {
	    return name;
    }

   
    public void deposit(double amount)
   {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
	 
    public String toString()
    {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();	
    	return (" acctNumber "  + acctNumber +  " balance : " + fmt.format(balance)
			   + " name : " + name  );
	}

	//Class method to display our private static variable
	public static int getAcctCount()
	{
		return ( acctCount );
	}
	
}// end of class definition
