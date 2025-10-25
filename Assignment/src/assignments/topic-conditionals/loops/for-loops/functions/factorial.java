import java.util.Scanner;
// Wap to find factorial of a number
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factResult = 1;
        for (int i = 1; i <= num; i++) {
            factResult *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factResult);
        sc.close();
    }
}
