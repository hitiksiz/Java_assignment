// Wap to show the preincrement and postincrement of a variable with an example
public class IncrDerc{
  public static void main(String[] args){
    int i = 1;
    System.out.println("Initial value of i :"+i);
    
    int preIncrement = ++i; //this step is done to get the preincrement value of i 
    System.out.println("Pre increment of i :"+preIncrement);
    
    int temp = ((i++)+10); //this step is done to get the postincremet value of i
    int postIncrement = i;
    System.out.println("Post increment of i :"+postIncrement);
  }
}