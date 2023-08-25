public class Question4 {
  public static void main(String[] args) {
    fiboonaci(new Fibo().series(5));
  }
}
class Fibo{
  void series(int n){
    int a = 0, b = 1,sum = a+b;
    System.out.println(a+" ");
    for (int i = 0; i < n; i++) {
      a = b;
      sum = a + b;
      System.out.print(sum+" ");
      b = sum;
    }
   }
  }
}
