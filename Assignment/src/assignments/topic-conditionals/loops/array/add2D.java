import java.util.Scanner;

// Wap to add two 2D arrays
public class add2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Return matrix1Info = inArr(sc, 1);
        int[][] matrix1 = matrix1Info.arr;

        Return matrix2Info = inArr(sc, 2);
        int[][] matrix2 = matrix2Info.arr;

        // Checking if sizes are equal
        if (matrix1Info.size != matrix2Info.size) {
            System.out.println("Uncommon matrix size. Can't be added!!!");
            sc.close();
            return; // Matrices can't be added of diff sizes
        }

        int[][] resultMatrix = add(matrix1, matrix2);

        printMatrix(resultMatrix);
        sc.close();
    }

    public static Return inArr(Scanner sc, int matNum) {
        System.out.print("Enter the size of matrix " + matNum + ": ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];

        System.out.println("\nEnter the elements of the matrix " + matNum + ": ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the element at index [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        return new Return(arr, size);
    }

    public static int[][] add(int[][] arr, int[][] arr2) {
        int[][] resultArr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                resultArr[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        return resultArr;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Resulting Matrix:");
        for (int[] row : matrix) { // got help from ai
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

class Return { // got help from ai
    int[][] arr;
    int size;

    Return(int[][] arr, int size) {
        this.arr = arr;
        this.size = size;
    }
}
