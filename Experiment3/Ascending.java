import java.util.*;
public class Ascending {
  public static void main(String[] args) {
    Scanner s_ob = new Scanner(System.in);
    System.out.print("Enter the length of array: ");
    int length = s_ob.nextInt();
    int[] num = new int[length];
    System.out.print("Enter the number in the array: ");
    inputArray(num);
    merge(num,0,num.length - 1);
    System.out.println("Sorting done");
    printSorted(num);
  }
  public static void printSorted(int[] num){
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i]+" ");
    }
    System.out.println();
  }
  public static void inputArray(int[] num) {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < num.length; i++){
      num[i] = sc.nextInt();
    }
  }
  public static void merge(int[] num, int si, int ei) {//Merge sort
    System.err.println("Welcome to merge");
    if (si >= ei){
      return;
    }
    int mid = si + (ei - si)/2;
    merge(num, si, mid);
    merge(num, mid, ei);
    sort(num, si, ei, mid);
  }
  public static void sort(int[] num, int si, int ei, int mid) {
    System.out.println("in the merge");
    int temp[] = new int[si+(ei - si)];
    int i = si, j = mid, k = 0;
    while (i < mid && j <= ei){
      if (num[i] < num[j]){
        temp[k] = num[i];
        i++; k++;
      } else {
        temp[k] = num[j];
        j++; k++;
      }
    }
    for (int l = 0; l < temp.length; l++) {
      num[l] = temp[l];
    }
    printSorted(num);
  }
}
