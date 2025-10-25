// Wap to take int, float, double var; perform opretations and get the result with explanations for the result shown
import java.util.Scanner;
public class mixOperations{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter int value a:");
    int a = sc.nextInt();
    System.out.println("Enter float value b:");
    float b = sc.nextFloat();
    System.out.println("Enter double value c:");
  
    double c = sc.nextDouble();
    
    displayResults(a,b,c); // calling the method to display the results
  }
  public static String getType(Object obj) {   // To get the type of the result Used AI suggestion
      return obj.getClass().getSimpleName();  // to show the type of the result
  }
  public static void displayResults(int a, float b, double c){
    // Addition
    System.out.println("\nAddition of int, float, double values: " + (a+b+c) +" "+  getType(a+b+c));
    System.out.print("Explanation: \nThis happens for addition because the result is stored in the largest data type, which is double.\n");
    // Subtraction
    System.out.println("Subtraction of int, float, double values: " + (a-b-c) +" "+  getType(a-b-c));
    System.out.print("Explanation: \nThis happens for subtraction because the result is stored in the largest data type, which is double.\n");
    // Multiplication
    System.out.println("Multiplication of int, float, double values: " + (a*b*c) +" "+  getType(a*b*c));
    System.out.print("Explanation: \nThis happens for multiplication because the result is stored in the largest data type, which is double.\n");
    // Division
    System.out.println("Division of int, float, double values: " + (a/b/c) +" "+  getType(a/b/c));
    System.out.print("Explanation: \nThis happens for division because the result is stored in the largest data type, which is double.");
  }
}