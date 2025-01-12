import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        int rows = 3, cols = 3; // Example for square matrices
        int[][] matrixA = generateMatrix(rows, cols);
        int[][] matrixB = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("\nAddition of A and B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("\nSubtraction of A and B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication
        System.out.println("\nMultiplication of A and B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        // Transpose
        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(matrixA));

        // Determinant and Inverse for 2x2 Matrix
        int[][] matrix2x2 = generateMatrix(2, 2);
        System.out.println("\n2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix2x2));
        System.out.println("\nInverse of 2x2 Matrix:");
        displayMatrix(inverse2x2(matrix2x2));

        // Determinant and Inverse for 3x3 Matrix
        System.out.println("\nDeterminant of 3x3 Matrix A: " + determinant3x3(matrixA));
        System.out.println("\nInverse of 3x3 Matrix A:");
        displayMatrix(inverse3x3(matrixA));
    }

    // Generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random numbers between 0-9
            }
        }
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, n = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is not invertible.");
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    // Inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is not invertible.");
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sign = ((i + j) % 2 == 0) ? 1 : -1;
                int[][] minor = new int[2][2];
                int rowIndex = 0, colIndex = 0;
                for (int k = 0; k < 3; k++) {
                    if (k == i) continue;
                    colIndex = 0;
                    for (int l = 0; l < 3; l++) {
                        if (l == j) continue;
                        minor[rowIndex][colIndex++] = matrix[k][l];
                    }
                    rowIndex++;
                }
                inverse[j][i] = sign * determinant2x2(minor) / (double) det;
            }
        }
        return inverse;
    }

    // Display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    // Overloaded method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.printf("%.2f\t", elem);
            }
            System.out.println();
        }
    }
}