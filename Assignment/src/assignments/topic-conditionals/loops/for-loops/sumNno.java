import java.util.Scanner;
// Wap to print sum of n numbers using for loop
public class sumNno{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int sum = 0;
    for(int i=1;i<=num;i++){ // using temp var i to iterate all the value from 0 to n and adding it to sum
      sum = sum + i;
    }
    System.out.println("Sum of first "+num+" numbers is: "+sum);
    sc.close();
  }
}