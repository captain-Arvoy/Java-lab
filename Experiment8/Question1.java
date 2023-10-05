/*
 * Write a java program to create a base class shape with methods draw() and calculateArea().
 * Create three subclasses: Circle,Square, and Triangle.
 * Override the draw() method in each subclass to draw method in each subclass to draw the respective shape
 * and overide the calculateArea() method to calculate and return the area of each shape.
 * */
import java.util.*;
public class Question1 {
  public static void main(String[] args) {
    shape s1 = new shape();
    s1.draw();
    s1.calculateArea();
    Circle c1 = new Circle();
    c1.draw();
    c1.calculateArea();
    Square sq1 = new Square();
    sq1.draw();
    sq1.calculateArea();
    Triangle t1 = new Triangle(); 
    t1.draw();
    t1.calculateArea();
  }
}
class shape{
  void draw(){
    System.out.println("Drawing shape...");
  }
  double calculateArea(){
    System.out.println("calculating area of any shape...");
    return 127.0;
  }
}
class Circle extends shape{
  Scanner sc = new Scanner(System.in);
  int radius;
  Circle(){
    System.out.print("Enter the radius of the circle: ");
    this.radius = sc.nextInt();
  }
  void draw(){
    System.out.println("Drawing the circle...");
  }
  double calculateArea(int radius){
    double area = 3.14*Math.pow(this.radius,2);
    System.out.println("area of circle = "+area);
    return area;
  }
}
class Square extends shape{
  int a;
  Scanner sc = new Scanner(System.in);
  Square(){
    System.out.print("Enter the side of square: ");
    this.a = sc.nextInt();
  }
  void draw(){
    System.out.println("Drawing the Square...");
  }
  double calculateArea(){
    System.out.println("Area of square = "+Math.pow(this.a,2));
    return Math.pow(this.a,2);
  }
}
class Triangle extends shape{
  int a, b, c;
  Scanner sc = new Scanner(System.in);
  void draw(){
    System.out.println("Enter the sides of triangle: ");
    this.a = sc.nextInt();
    this.b = sc.nextInt();
    this.c = sc.nextInt();
  }
  double calculateArea(){
    //semiPerimeter
    double semiPerimeter = (double)(this.a+this.b+this.c)/2;
    double area = Math.sqrt(Math.pow((semiPerimeter-this.a),2)+Math.pow((semiPerimeter-this.b),2)+Math.pow((semiPerimeter-this.c),2));
    System.out.println("Area of triangle: "+area);
    return area;
  }
}

