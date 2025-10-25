// WAP to print all primitive data types, print their default & assigned values; 

public class PrimitiveDataType {
  // Using static keyword to declare variables for their default values by java
  static byte a;   
  static short b;  
  static int c;    
  static long d;   
  static float e;  
  static double f; 
  static char g;   
  static boolean h; 
  public static void main(String[] args) {
      System.out.println("Primitive Defalut Values");

      // Print default values
      System.out.println("byte   value: " + a);
      System.out.println("short   value: " + b);
      System.out.println("int   value: " + c);
      System.out.println("long   value: " + d);
      System.out.println("float   value: " + e);
      System.out.println("double   value: " + f);
      System.out.println("char   value: " + g);
      System.out.println("boolean   value: " + h);

    System.out.println("Primitive Assinged Values");
      // Assigning values
      a = 10;
      b = 20;
      c = 30;
      d = 40L;
      e = 50.0f;
      f = 60.0d;
      g = 'A';
      h = true;
      // Print default values
      System.out.println("byte   value: " + a);
      System.out.println("short   value: " + b);
      System.out.println("int   value: " + c);
      System.out.println("long   value: " + d);
      System.out.println("float   value: " + e);
      System.out.println("double   value: " + f);
      System.out.println("char   value: " + g);
      System.out.println("boolean   value: " + h);

    
    
  }
}