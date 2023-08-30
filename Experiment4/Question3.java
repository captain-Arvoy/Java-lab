import java.util.*;
public class Question3 {
  public static void main(String[] args) {
    Employee em = new Employee();
    em.input();
    em.print();
  }
}
class Employee{
  String name;
  String qualification;
  int EmpId;
  void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the employee: ");
    this.name = sc.nextLine();
    System.out.print("Enter the qualification: ");
    this.qualification = sc.nextLine();
    System.out.print("Enter the employee id: ");
    this.EmpId = sc.nextInt();
  }
  void print(){
    System.out.println("-----------The employee details are-----------");
    System.out.println("The name of the employee is: "+this.name);
    System.out.println("The qualification: "+this.qualification);
    System.out.println("The Employee id: "+this.EmpId);
  }
}
