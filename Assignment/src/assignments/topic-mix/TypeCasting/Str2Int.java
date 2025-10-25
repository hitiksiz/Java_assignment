// Wap to typecaste from str to int then add 10 to it and print the result
public class Str2Int{
  public static void main(String[] args){
    String inputStr = "123";
    Integer i = Integer.valueOf(inputStr) +10 ; // Typecasting used of using valueOf() function
    System.out.println("String: "+inputStr+"\nInteger: "+i);
  }
}