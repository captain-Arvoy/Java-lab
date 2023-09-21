/*
 * Define a class dimension, inherit class line form dimension, rectangle from line, and box from rectangle. write a print function in each class to print the class properties. Each class should have some number of constructors
 * */
class Dimension{
  int length;
  int breadth;
  int height;
  Dimension(){
    System.out.println("Accessed class dimension");
  }
}
class Line extends Dimension {
  int length;
  super();
  this.length = 2;
  this.breadth = 0;
  this.heigth  = 0;
  Line(){

  }
  System.out.println("Length of line : "+this.length);
  System.out.println("breadth of line : "+this.breadth);
  System.out.println("heigth of line : "+this.heigth);
}
class Rectangle extends Line{
  Rectangle(int length, int breadth, int heigth){
    this.length = length;
    this.breadth = breadth;
    this.heigth = heigth;
  }
  System.out.println("Length of rectangle"+this.length);
  System.out.println("Length of rectangle"+this.breadth);
  System.out.println("Length of rectangle"+this.heigth);
}
class Box extends Rectangle {
  super(1,2,3);
  Box(){
    System.out.println("Extended from Rectangle");
  }
}
public class Question1 {
  public static void main(String[] args) {
    
  }
}
