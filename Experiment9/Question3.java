
//Create an abstract class shape with methods Calc-area and Calc-vol.Define 4 classes Sphere(int radius), cone(r,h), cylinder(r,h) and Box(l,b,h)

import java.util.*;
abstract class Shape{
  public abstract double calcArea();
  public abstract double calcVol();
}
class Sphere extends Shape{
  public double calcArea(int radius){
    return 4*Math.PI*Math.pow(radius,2);
  }
  public double calcVol(int radius){
    return 4/3*Math.PI*Math.pow(radius,3);
  }
}
class Cone extends Shape{
  public double calcArea(double radius,double height){
    double l = Math.sqrt(Math.pow(radius,2)+Math.pow(radius,2));
    return Math.PI*radius*l;
  }
  public double calcVol(float radius,double height){
    return 1/3*Math.PI*Math.pow(radius,2)*height;
  }
}
class Cylinder extends Shape{
  public double calcArea(double radius,double height,int buffer){
    return 2*Math.PI*radius*height;
  }
  public double calcVol(float radius,double height){
    return Math.PI*Math.pow(radius,2)*height;
  }
}
class Box extends Shape{
  double length, breadth,height;
  Box(double length,double breadth){
    th
  }
  public double calcArea(double length,double breadth){
    return length*breadth;
  }
  public double calcVol(double length,double breadth,double height){
    return length*breadth*height;
  }
}
public class Question3 {
  public static void main(String[] args) {
    Sphere s = new Sphere();
    System.out.println("Area of sphere");
    System.out.println();
    Cone c = new Cone();
    System.out.println();
    System.out.println();
    Cylinder cl = new Cylinder();
    System.out.println();
    System.out.println();
    Box b = new Box();
    System.out.println();
    System.out.println();
  }
}
