// WAP to convert double type to int type and explain the functioning used 
public class Double2Int{
    public static void main(String[] args){
        double d = 100.25;
        int i = (int)d;                      // <-here the double value is converted to int using int typecasting 
                                             //  function in the java converting the decimal part to zero.
        System.out.println("Double value "+d);
        System.out.println("Int value "+i);
    }
}