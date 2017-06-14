package introToClasses;

public class Account 
{
	double balance;
	double interestRate;
	int accountNumber;
////////////Talk about Constructor///////////////////////////////////////
	//Talk about scope of variables//
	//Talk about "this" modifier//
	public Account(int accountNumber, double balance, double interestRate)
	{
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNumber = accountNumber;
	}
////////////Second///////////////////////////////////////////////	
	public int getNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getInterest()
	{
		 return this.interestRate;
	}
/////////////Third///////////////////////////////////////////////
	//Talk about parameters//
	//set methods//
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public void setInterest(double interest)
	{
		this.interestRate = interest;
	}

	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}
	
	public void withdrawl(double amount)
	{
		this.balance = this.balance - amount;
	}
///////////////LAST//////////////////////////////////////////	
	public void calcInterest(int time)
	{
		this.balance = balance*Math.pow((1+interestRate/100), time);
	}

}
