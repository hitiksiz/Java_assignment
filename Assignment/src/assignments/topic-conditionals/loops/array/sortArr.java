import java.util.Arrays;
import java.util.Scanner;
// Wap to sort an array in ascending order
public class  sortArr{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
    int [] arr = new int[size];
    System.out.println("\nEnter the elements of the array: ");
    for (int i = 0 ; i< size;i++){
      System.out.print("Enter the element at index "+i+": ");
      int element = sc.nextInt();
      arr[i] = element;
    }
    sc.close();
    sort(arr,size);
  }
  public static void sort(int [] arr , int size){
    int[] sortedArr = arr.clone();
    System.out.println("\nThe array is: "+ Arrays.toString(sortedArr));
    int temp = 0;
    for (int i = 0; i<arr.length; i++){        // Got help from YT & GeeksforGeeks
      for (int j = i+1; j<arr.length; j++){
        if (sortedArr[j] < sortedArr[i]){
          temp = sortedArr[i];
          sortedArr[i] = sortedArr[j];
          sortedArr[j] = temp;
        }
      }
    }
    System.out.println("\nThe sorted array is: ");
    System.out.print(Arrays.toString(sortedArr));
    
  }
}