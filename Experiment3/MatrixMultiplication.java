import java.util.*; 
public class MatrixMultiplication {
  public static void main(String[] args) {
    int arr1[][] = new int[3][3];
    int arr2[][] = new int[3][3];
    //input the array
    arrayInput(arr1);
    arrayInput(arr2);
    printArray(multiply(arr1,arr2));
  }
  public static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    
  }
  public static void arrayInput(int arr[][]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Elements for array: ");
    for(int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
  }
  public static int[][] multiply(int arr1[][],int arr2[][]){
    int productArr[][] = new int[3][3];
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1.length; j++) {
        int sum = 0;
        for (int k = 0; k < productArr.length; k++) {
          sum += arr1[i][k]*arr2[k][j];
        }
        productArr[i][j] = sum;
      }
    }
    return productArr;
  }
}
