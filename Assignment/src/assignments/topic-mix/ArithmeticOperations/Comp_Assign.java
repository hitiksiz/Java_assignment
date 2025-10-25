// Wap to manipulate the value of var using compund assignment operators;
public class Comp_Assign{
  public static void main(String[] args){
    int a = 1, b = 2;
    System.out.println("Initial value of a :"+a+"\nInitial value of b :"+b);
    System.out.println();
    System.out.println("Add Assignment :"+(a+=b)+"\nSubtract Assignment :"+(a-=b)+"\nMultiply Assignment :"+(a*=b)+"\nDivide Assignment :"+(a/=b));
  }
}