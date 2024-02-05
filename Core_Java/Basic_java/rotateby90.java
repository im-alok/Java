import java.util.*;

public class rotateby90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows, cols, temp;
        rows = input.nextInt();
        cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        // int[][] transpose = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();

            }
        }
        System.out.println("Required matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(" " + matrix[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {

                matrix[j][rows - 1 - i] = matrix[i][j];
                System.out.print(" " + matrix[j][rows - 1 - i] + " ");
            }
            System.out.println();
        }

    }
}
