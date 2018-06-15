package Day17;
import java.util.Scanner;
public class SumofLeftDiagonalofArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of rows/columns in matrix : ");

        int rows = scanner.nextInt();
        int columns=rows;
        int[][] matrix = new int[rows][rows];

        System.out.println("Input the number of elements in the matrix :");
        for (int i = 0; i < rows; i++) {
            for (int x = 0; x < columns; x++) {
                matrix[i][x] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 1; i < rows; i++) {
            for (int x = i - 1; x >= 0; x--){
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
        System.out.println("sum of all the elements below the left diagonal is: "+ sum);
    }
}