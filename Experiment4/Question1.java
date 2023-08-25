import java.util.*;
public class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student();
    s1.input();
    s1.print();
  }
}
class Student{
  String RollNo;
  String name;
  int marks[] = new int[5];
  void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("***Enter the RollNo***");
    this.RollNo = sc.nextLine();
    System.out.println("***Enter your Name***");
    this.name = sc.nextLine();
    System.out.println("***Enter your marks***");
    for (int i = 0; i < marks.length; i++) {
      this.marks[i] = sc.nextInt();
    }
  }
  void print(){
    int avg = (this.marks[0] + this.marks[1] + this.marks[2] + this.marks[3] + this.marks[4])/5;
    System.out.println("The avg = "+avg);
  }
}
