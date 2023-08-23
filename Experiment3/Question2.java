import java.util.*;
public class Question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[6];
    System.out.print("Enter array of 6 elements: ");
    inputArray(arr);
    System.out.println("******INPUT SUCCESSFUL*****");
    int largestNo = findLargest(arr);
    checkInput(arr,largestNo);
  }
  public static void inputArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }
  public static int findLargest(int arr[]) {
    int largestNo = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largestNo){
        largestNo = arr[i];
      }
    }
    System.out.println("Largest Number: "+largestNo);
    return largestNo;
    
  }
  public static void checkInput(int[] arr,int largestNo) {
    int counter[] = new int[largestNo + 1];
    for (int i = 0; i < arr.length; i++) {
      counter[arr[i]]++;
    }
    System.out.print("Duplicates are : ");
    for (int j = 0; j < counter.length; j++) {
      if(counter[j] > 1){
        System.out.print(j+" ");
      }
    }
  }
} 
