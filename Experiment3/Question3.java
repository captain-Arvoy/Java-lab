import java.util.*;
public class Question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.print("Enter the array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    bubbleSort(arr);
  }
  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    System.out.print("Second largest No: "+arr[arr.length - 2]);

  }
}

