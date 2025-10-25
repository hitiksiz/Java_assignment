import java.util.Scanner;
// Wap to transpose a matrix
// got help from https://www.geeksforgeeks.org/java/java-transpose-matrix/
public class transposeArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Result matrixinfo = matrices(sc);
        int[][] matrix = matrixinfo.arr;
        sc.close();
        transpose(matrix,matrixinfo.size);
    }
    public static Result matrices(Scanner sc){
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
  public static void transpose(int[][] arr,int matxInfo){
    int[][] arr2 = new int[matxInfo][matxInfo];
    for (int i =0;i<arr.length;i++){
      for (int j = 0 ; j < arr[i].length; j++){
        arr2[i][j] = arr[j][i];
      }
    }
    System.out.println("Original matrix is: ");
    for (int[] row: arr){
      for (int element: row){
        System.out.print(element + " ");
      }
      System.out.println();
    }
    System.out.println("Transposed matrix matrix is: ");
    for (int[] row: arr2){
      for (int element: row){
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}

class Result{
  int [][] arr;
  int size;
  Result(int [][] arr,int size){
    this.arr = arr;
    this.size = size;
  }
}