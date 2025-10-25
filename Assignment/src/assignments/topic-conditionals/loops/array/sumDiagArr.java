import java.util.Scanner;
// Wap to find the sum of the diagonal elements of a matrix
public class sumDiagArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Result matrixInfo = userMatrix(sc);
        int[][] matrix = matrixInfo.arr;
        sumDiag(matrix, matrixInfo.size);
        sc.close();
    }
  public static Result userMatrix(Scanner sc){
      System.out.print("Enter the size of the matrix: ");
      int size = sc.nextInt();
      int[][] arr = new int[size][size];
      for (int i = 0 ; i < arr.length; i++){
        for (int j = 0 ; j < arr[i].length; j++){
          System.out.print("Enter the element at index [" + (i+1) + "][" + (j+1) + "]: ");
          arr[i][j] = sc.nextInt();
        }
      }
      return new Result(arr,size);
    
  }
  public static void sumDiag(int[][] arr,int size){
    int sum = 0;
    for (int i = 0 ; i < arr.length; i++){
      sum +=arr[i][i];
    }
    System.out.println("\n Matrix is: ");
    for (int [] row:arr){
      for (int element :row){
        System.out.print(element + " ");
      }
      System.out.println();
    }
    System.out.println("\nThe sum of the diagonal elements of the matrix is: " + sum);
  }
}
class Result{
  int [][] arr;
  int size;
  Result(int [][] arr,int size){
    this.arr = arr ;
    this.size =size;
  }
}