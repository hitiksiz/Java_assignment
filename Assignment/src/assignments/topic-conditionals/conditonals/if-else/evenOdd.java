import java.util.Scanner;
// Wap to check if a number is even or odd
public  class evenOdd{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    if(num%2==0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
    sc.close();
  }
}