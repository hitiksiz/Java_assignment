import java.util.Scanner; // used ai suggestions for the user input for this import

public class numCheckRelaLog{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();  
    int a=10,b=50;
    // Checks for relational operatortions btw num and a,b;
    if (num>a && num<b){
      System.out.println("num is b/w than both 10 and 50");
    }
    else if (num>b){
      System.out.println("Num is overbound then 50");
    }
    else if (num<a){
      System.out.println("Num is inbound than 10");
    }
    else if (num==a){
      System.out.println("Num is equal to 10");
    }
    else if (num==b){
        System.out.println("Num is equal to 50");
    }
    sc.close();
  }  
}