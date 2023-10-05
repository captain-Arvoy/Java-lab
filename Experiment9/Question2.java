//create an abstract class shape, it's implementation is provided by Rectangle and Circle class. Object of the implemention class returns the instance of the class
import java.util.*;
abstract class Shape{
  public abstract void display();
  public abstract Shape shapeOb();
}
class Rectangle extends Shape{
  public void display(){
    System.out.println("This is Rectangle");
  }

  public Shape shapeOb(){
    return new Rectangle();
  }
}
class Circle extends Shape{
  public void display(){
    System.out.println("This is Circle");
  }
  public Shape shapeOb(){
    return new Circle();
  }
}
public class Question2 {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.display();
    System.out.println("Object of rectangle = "+r.shapeOb());
    Circle c = new Circle();
    c.display();
    System.out.println("Object of circle = "+c.shapeOb());
  }
}
