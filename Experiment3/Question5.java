import java.util.*;
public class Question5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.print("Enter the 5 elements for the array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int arrCopy[] = new int[arr.length];
    System.arraycopy(arr,0,arrCopy,0,arr.length);
    System.out.println("The copy of original array is: "+Arrays.toString(arrCopy));
  }
}
