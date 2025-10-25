import java.util.Scanner;
// Wap to find the length of the number
public class lenInputInt{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int len = 0;
    while(num>0){
      num = num/10;
      len++;
    }
    System.out.println("Length of the number is: "+len);
    sc.close();
  }
}