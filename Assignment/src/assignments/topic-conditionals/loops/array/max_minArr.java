import java.util.Scanner;
import java.util.Arrays;

public class max_minArr {
    // WAP to find the maximum and minimum element in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return; // this return in void function will terminate futher (got suggestion from ai )
        }

        System.out.println("\nEnter the elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) { // Note: i < size gets me from 0...size-1 as i will check for <size condition
            System.out.print("Enter the element for index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEntered array is: " + Arrays.toString(arr) + "\n");
        System.out.print("Enter 1 for manual method and 2 for array function method: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                manual(arr);
                break;
            case 2:
                arrayFunc(arr);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

    // Added return type 'void' to the method declaration
    public static void manual(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) { // Changed loop condition for clarity
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }

    // Added return type 'void' to the method declaration
    public static void arrayFunc(int[] arr) {
        Arrays.sort(arr); // Sort the array
        System.out.println("\nSorted array is: " + Arrays.toString(arr));
        System.out.println("Maximum element is: " + arr[arr.length - 1] + "\nMinimum element is: " + arr[0]); // Fixed array access
    }
}
