/*
 * Write a java program to find out the area of Circle, Cone and Cylinder by using Constructor overloading
 * */
import java.util.*;
public class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of circle: ");
    int radius = sc.nextInt();
    Mensuration q = new Mensuration(radius);
    System.out.println("Enter the radius and slant height of cone: ");
    radius = sc.nextInt();
    int slant = sc.nextInt();
    Mensuration q2 = new Mensuration(radius,slant);
    System.out.println("Enter the radius and height: ");
    float radi = sc.nextInt();
    float height = sc.nextInt();
    Mensuration q3 = new Mensuration(radi, height);
  }
}
class Mensuration{
  Mensuration(int radius){ // area circle
    System.out.println("Area of circle = "+Math.PI*Math.pow(radius,2));
  }
  Mensuration(int radius, int l){//area of cone
    System.out.println("Total surface area of cone = "+Math.PI*radius*(radius+l));
    System.out.println("curved surface area of cone = "+Math.PI*radius*l);
  }
  Mensuration(float radius, float height){//area of Cylinder
    System.out.println("Curved Area of cylinder = "+Math.PI*radius*height);
    System.out.println("Total surface area of cylinder = "+(Math.PI*radius*height+2*Math.PI*radius*radius));
  }
}

