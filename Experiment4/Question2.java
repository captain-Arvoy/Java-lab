import java.util.*;
public class Question2 {
  public static void main(String[] args) {
    Bank customer1 = new Bank();
    Scanner sc = new Scanner(System.in);
    customer1.input();
    while(true){
      System.out.println("***Enter the choice***");
      System.out.println("1. withdraw\n2.deposit\n3.checkBalance");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          customer1.withdraw();
          break;
        case 2:
          customer1.deposit();
          break;
        case 3:
          customer1.checkBalance();
          break;
        default:
          System.out.println("Invalid");
          break;
      }
    }
  }
}
class Bank{
  int accno;
  String name;
  String IFSCCode;
  int Balance = 0;
  Scanner sc = new Scanner(System.in);
  void input(){
    System.out.print("Enter the accno: ");
    this.accno = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the name: ");
    this.name = sc.nextLine();
    System.out.print("Enter the IIFC: ");
    this.IFSCCode = sc.next();
  }
  void withdraw(){
    if (this.Balance < 1500){
      System.out.println("You cannot withdraw");
    } else {
      int denomination = this.Balance;
      int Deno500 = denomination/500;
      denomination -= Deno500*500;
      int Deno100 = denomination/100;
      System.out.println("***Denomination***\n1.500 -:"+Deno500+"2.100 -:"+Deno100);
    }

  }
  void deposit(){
    System.out.print("Enter the amount to deposit: ");
    this.Balance = sc.nextInt();
  }
  void checkBalance(){
    System.out.println("Your current balance: "+this.Balance);
  }
}
