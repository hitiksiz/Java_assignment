import java.util.Scanner;
// Wap to check whether the character is vowel or consonant
public class  charVow{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a character: ");
      char ch = sc.next().toLowerCase().charAt(0); // got ai help for figuring new functions in java
      switch(ch){                                 // each case will be check for true in lowercase match
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:                           // if no case matches then default -> consonant
                    System.out.println("Consonant");
      }
        sc.close();
    }
}