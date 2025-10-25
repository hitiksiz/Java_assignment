import java.util.Scanner;
// Wap to check if a number is greater than 10 or not
public class greaterThen{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1: ");
    int num1 = sc.nextInt();  
    System.out.println("Enter num2: ");
    int num2 = sc.nextInt();
    if(num1>num2){
      System.out.println(num1+" is greater then "+num2);
    }
    else{
      System.out.println(num2+" is greater then "+num1);
    }
    sc.close();
  }
}