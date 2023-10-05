/*
 * Write a Java program to create a base class Bank with methods deposit() and withdraw().
 * Create three subclass to withdraw: SBI, ICICI, AXIS and Override the withdraw() method in each subclass to withdraw
 * the money. If deposit<1000 then it shows the insufficient condition. Do this by using dynamic method dispatch 
 * */
import java.util.*;
public class Question3 {
  public static void main(String[] args) {
    Bank b = new Bank();
    sbi acc1 = new sbi();
    acc1.deposit();
    acc1.withdraw();
    icici acc2 = new icici();
    acc2.deposit();
    acc2.withdraw();
    axis acc3 = new axis();
    acc3.deposit();
    acc3.withdraw();
  }
}
class Bank{
  void deposit(){
    System.out.println("Banks are ready for deposit");
  }
  void withdraw(){
    System.out.println("Banks are ready for withdrawl");
  }
  double amountDeposit,amountWithdraw;
}
  class sbi extends Bank{
    Scanner sc = new Scanner(System.in);
    sbi(){
      System.out.print("Enter the amount to deposit: ");
      this.amountDeposit=sc.nextDouble();
      System.out.print("Enter the amount to withdraw: ");
      this.amountWithdraw=sc.nextDouble();
    }
    void deposit(){
      System.out.println(this.amountDeposit+"amount deposited from sbi.");
    }
  }
  class icici extends Bank{
    Scanner sc = new Scanner(System.in);
    icici(){
      System.out.print("Enter the amount to deposit: ");
      this.amountDeposit=sc.nextDouble();
      System.out.print("Enter the amount to withdraw: ");
      this.amountWithdraw=sc.nextDouble();
    }
    void deposit(){
      System.out.println(this.amountDeposit+"amount deposited from icici.");
    }
  }
  class axis extends Bank{
    Scanner sc = new Scanner(System.in);
    axis(){
      System.out.print("Enter the amount to deposit: ");
      this.amountDeposit=sc.nextDouble();
      System.out.print("Enter the amount to withdraw: ");
      this.amountWithdraw=sc.nextDouble();     
    }
    void deposit(){
      System.out.println(this.amountDeposit+"amount deposited from axis.");
    }
  }

