import java.util.Scanner;
import java.util.Arrays;  // got help from ai models for figuring out Arrays.sum() method
// Wap to find sum of array elements
public class sumArray{
  public static void main(String[] args){
    Scanner sc = new  Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int manSum = 0;
    System.out.print("Enter the elements of array: \n");
    int[] arr = new int[size];
    for (int i =0; i<=size-1; i++){
      System.out.print("Enter the element "+i+": ");
      arr[i] = sc.nextInt();    //getting every element on its indexing
      manSum += arr[i];
    }
    System.out.println("Sum of array elements is: "+manSum + " and using Arrays.sum() method: "+ Arrays.stream(arr).sum());
    sc.close();
  }
}