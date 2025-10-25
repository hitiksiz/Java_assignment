import java.util.Scanner;
// Wap to print multiplication table of a number 
public class multiTable{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num to  print the table: ");
    int num = sc.nextInt();
    System.out.println("Table of "+num);
    System.out.println("-----------------");
    printTable(num);
    System.out.println("-----------------");
    sc.close();
  }
  public static void printTable(int num){ // used functions to print the table
    for (int i=1;i<=10;i++){
      System.out.println(num+"*"+i+"="+(num*i));
    }
  }
}