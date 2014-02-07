package src;

/*
James Park
CIT 210 Section 1
Account Class
Oct 24, 2012


*/

import java.util.Date;
public class Account {
   private int id = 0;
   private double balance = 0;
   private double annualInterestRate = 0.0;
   private Date dateCreated;

   Account() {
      dateCreated = new Date();
   }

   Account(int id, double balance) {
      this.setId(id);
      this.setBalance(balance);
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public double getAnnualInterestRate() {
      return annualInterestRate;
   }

   public void setAnnualInterestRate(double annualInterestRate) {
      this.annualInterestRate = annualInterestRate;
   }

   public Date getDateCreated() {
      return dateCreated;
   }

   public double getMonthlyInterestRate() {
      return annualInterestRate / 12.0;
   }
	
   public void withdraw(double amount) {
      if (amount <= balance) {
         balance -= amount;
      } else {
         System.out.println("Insufficient Funds");
      }
   }
	
   public void deposit(double amount) {
      balance += amount;
   }
}