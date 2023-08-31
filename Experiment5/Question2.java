/*
 * Write a program to create a triangle class with contructors (no-arguement and parametrized) having instance variables to record its 3 sides. 
 * Write validate() method, to check for valid input. 
 * Use findArea() and findPerimeter() of the Triangle class object.
 * */
import java.util.*;
public class Question2{
  public static void main(String args[]) {
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle(2,3);
  }
}
class Triangle{
  int a, b, c;
  Triangle(int para1,int para2){
    System.out.println("*****called parametrized const*****");
  }
  Triangle(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the three sides: ");
    this.a = sc.nextInt();
    this.b = sc.nextInt();
    this.c = sc.nextInt();
    if(validity()){
      findArea();
      findPerimeter();
    } else {
      System.out.println("Not legal Triangle.");
    };
  }
  boolean validity(){
    boolean isValid = false;
    if ((this.a+this.b) > this.c && (this.b+this.c)>this.c && (this.a+this.c)>this.b) {
      isValid = true;
    }
    return isValid;
  }
  void findArea(){
    float s = (this.a + this.b + this.c)/3;
    float area = (float)(Math.sqrt(s*(s-this.a)+s*(s-this.b)+s*(s-this.c)));
    System.out.println("Area of triangle: "+area);
  }
  void findPerimeter(){
    System.out.println("Perimeter of triangle: "+(a+b+c));
  }
}
