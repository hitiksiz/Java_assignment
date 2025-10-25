import java.util.Scanner;

public class counEveOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("\nEnter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      System.out.print("Enter the element at index " + i + ": ");
      int element = sc.nextInt();
      arr[i] = element;
    }
    sc.close();
    System.out.print("\nCount of Even: " + count(arr, size).even + "\nCount of Odd: " + count(arr, size).odd);
  }

  public static Result count(int[] arr, int size) {
    int even = 0, odd = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    return new Result(even, odd);
  }
}
  class Result {
      int even;
      int odd;

      Result(int even, int odd) {
          this.even = even;
          this.odd = odd;
      }
  }

  