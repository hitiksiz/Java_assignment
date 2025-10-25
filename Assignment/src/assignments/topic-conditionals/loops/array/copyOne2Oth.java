import java.util.Scanner;
import java.util.Arrays;

public class copyOne2Oth{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int [] arr = new int[size];
    System.out.println("\nEnter the elements of the array: ");
    for (int i = 0 ; i < arr.length; i++){
      System.out.print("Enter the element at index " + i+ ": ");
      int element = sc.nextInt();
      arr[i] = element;
    }
    sc.close();
    copy(arr,size);
  }
  public static void copy(int [] arr, int size){
    int [] arr2 = new int[size];
    for (int i = 0 ; i < arr.length; i++){
      arr2[i]  = arr[i];
    }
    System.out.println("\nThe original array is: arr "+Arrays.toString(arr));
    System.out.println("\nThe copied array is: arr2 " + Arrays.toString(arr2));
  }
}