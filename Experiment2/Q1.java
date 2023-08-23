import java.util.*;
public class Q1 {
  static class Employee{
    String name;
    int age;
    String department;
    int salary;
    int pf;
    char gender;
  }
  public static void main(String[] args) {
    Employee em = createEmployee();
    printEmployee(em);
  } 
  public static Employee createEmployee() {
    Employee em = new Employee();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the Employee: ");
    em.name = sc.nextLine();
    System.out.print("Enter the age of the Employee: ");
    em.age = sc.nextInt();
    sc.next();//buffer flusher
    System.out.print("Enter the department of the Employee: ");
    em.department = sc.nextLine();
    System.out.print("Enter the salary of the Employee: ");
    em.salary = sc.nextInt();
    System.out.print("Enter the PF of the Employee: ");
    em.pf = sc.nextInt();
    System.out.print("Enter the gender of the employee: ");
    em.gender = sc.next().charAt(0);
    return em;
  }
  public static String printEmployee(Employee em) {
    // System.out.print("The name of the Employee: "+em.name);
    // System.out.print("Enter the age of the Employee: "+em.age);
    // System.out.print("Enter the department of the Employee: "+em.department);
    // System.out.print("Enter the salary of the Employee: "+em.salary);
    // System.out.print("Enter the PF of the Employee: "+em.pf);
    // System.out.print("Enter the gender of the employee: "+em.gender);
    return em.name;
    return em.age;
    return em.department;
    return em.salary;
    return em.pf;
    return em.gender;
  }
}
