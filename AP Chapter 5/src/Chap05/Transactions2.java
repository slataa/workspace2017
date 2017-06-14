//********************************************************************
//  Transactions2.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.10
//********************************************************************

public class Transactions2
{
   //-----------------------------------------------------------------
   //  Tests the validity checks on deposit and withdraw operations.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Account2 acct = new Account2("Felix Unger", 12345, 100.00);

      acct.deposit(-20.00);
      acct.deposit(400.00);

      acct.withdraw(1000.00, 2.00);
      acct.withdraw(50.00, 2.00);

      System.out.println();
      System.out.println(acct);
   }
}
