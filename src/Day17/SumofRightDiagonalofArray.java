package Day17;
import java.util.Scanner;

public class SumofRightDiagonalofArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows/columns in matrix : ");

        int rows = scanner.nextInt();
        int columns = rows;
        int [][] matrix = new int[rows][rows];

        System.out.println("Input the elements in the matrix :");
        for (int i = 0; i < rows; i++) {
            for (int x = 0; x < columns; x++) {
                matrix[i][x] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int x = 1; x < columns; x++) {
            for (int i = x - 1; i >= 0; i--) {
                sum = sum + matrix[i][x];
            }
        }

        System.out.println("\nMatrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int x = 0; x < columns; x++) {
                System.out.println(matrix[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements of the right diagonal is: "+sum);
    }
    
}
