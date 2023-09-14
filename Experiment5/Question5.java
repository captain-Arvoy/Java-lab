/* WAP to create a Person class having name, age and gender as instance variables. 
 * Write 3 contructors for contructor overloading like 
a. with no arguement
b. with all parameters 
*/
public class Question5 {
  public static void main(String[] args) {
    Person p = new Person("Aditya Roshan Dash",6,'M');
    Person p2 = new Person(25,'M');
    Person p3 = new Person('M');
  }
}
class Person{
  String name;
  int age;
  char gender;
  Person(String name, int age, char gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  Person(int age, char gender){
    this.age = age;
    this.gender = gender;
  }
  Person(char gender){
    this.gender = gender;
  }
}
