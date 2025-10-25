import java.util.Scanner;
// Wap to search an element in an array using linear search
public class lineSear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Check if size is valid
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return; // Exit if invalid size
        }

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        // if wanting to print the array
        // System.out.println("Entered array is: " + Arrays.toString(arr));
        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();

        boolean found = false; 

        for (int x = 0; x < size; x++) {
            if (arr[x] == search) { 
                System.out.println("Element found at index " + x);
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
