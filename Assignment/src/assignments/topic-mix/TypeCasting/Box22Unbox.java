public class Box22Unbox{
  public static void main(String[] args){
    int i = 10;
    Integer iObj = Integer.valueOf(i); // Boxing
    int j = iObj.intValue(); // Unboxing
    System.out.println("Boxed Integer: "+iObj+"\nUnboxed Integer: "+j);
  }
}