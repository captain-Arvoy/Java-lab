public class Question4 {
  public static void main(String[] args) {
    new Fibo().series(5);
  }
}
class Fibo{
  void series(int n){
    int a = 0, b = 1, sum = a+b;
    System.out.print(a+" ");
    for (int i = 0; i < n - 1; i++) {
      b = sum;
      System.out.print(sum+" ");
      sum = a + b;
      a = b;
    }
  }
}
