import java.util.Scanner;
public class revInt{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt(),rev=0;
    while(num>0){
      rev = rev*10 + num%10;
      num/=10;
    }
    System.out.println("Reversed number is: "+rev);
  }
}