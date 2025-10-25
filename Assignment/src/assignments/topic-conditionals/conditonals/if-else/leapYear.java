import java.util.Scanner;
// wap to check if a year is leap year or not
public class leapYear{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = sc.nextInt();
    if(year%4==0){
      System.out.println("Leap Year");
    }
    else{
      System.out.println("Not a Leap Year");
    }
    sc.close();
  }
}