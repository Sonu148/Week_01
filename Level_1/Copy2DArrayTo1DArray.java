import java.util.Scanner;
public class Copy2DArrayTo1DArray {
    public static void main(String[] args) {

        // Creating the Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Taking the user input for rows and columns
        System.out.print("Enter the number of rows in the 2D array: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns in the 2D array: ");
        int columns = input.nextInt();

        // Storing the multi-dimensional array
        int[][] matrix = new int[rows][columns];

        // Creating the 1D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Prompt to enter elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");

        // Nested loops to populate the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        input.close(); // Closing the scanner
    }
}
