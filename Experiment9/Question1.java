
//Write a java program to demonstrate multiple inheritance through default method (using interface)
import java.util.*;
interface interface1{
  default abstract void display(); 
}
interface interface2{
  default abstract void display();
}
public class Question1 implements interface1,interface2{
  @Override
  public void display(){
    System.out.println("Overriden");
  }
  public static void main(String[] args) {
    Question1 q1 = new Question1();
  }
} 
