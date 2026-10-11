package Assingment1;
import java.util.*;
public class Question3 {
	static void display(int[][] matrix, int rows, int cols) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    static void addition(int[][] a, int[][] b, int rows, int cols) {

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition:");
        display(result, rows, cols);
    }

    static void subtraction(int[][] a, int[][] b, int rows, int cols) {

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction:");
        display(result, rows, cols);
    }

    static void multiplication(int[][] a, int[][] b,
                               int r1, int c1, int c2) {

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication:");
        display(result, r1, c2);
    }

    static void transpose(int[][] matrix, int rows, int cols) {

        System.out.println("Transpose:");

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }

            System.out.println();
        }
    }

    static boolean isSquare(int[][] matrix, int rows, int cols) {
        return rows == cols;
    }

    static boolean isDiagonal(int[][] matrix, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isIdentity(int[][] matrix, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j && matrix[i][j] != 1) {
                    return false;
                }

                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;

}


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter rows of Matrix A: ");
    int r1 = sc.nextInt();

    System.out.print("Enter columns of Matrix A: ");
    int c1 = sc.nextInt();

    int[][] a = new int[r1][c1];

    System.out.println("Enter Matrix A:");

    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
            a[i][j] = sc.nextInt();
        }
    }

    System.out.print("Enter rows of Matrix B: ");
    int r2 = sc.nextInt();

    System.out.print("Enter columns of Matrix B: ");
    int c2 = sc.nextInt();

    int[][] b = new int[r2][c2];

    System.out.println("Enter Matrix B:");

    for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
            b[i][j] = sc.nextInt();
        }
    }

    if (r1 == r2 && c1 == c2) {

        addition(a, b, r1, c1);
        subtraction(a, b, r1, c1);

    } else {
        System.out.println("Addition and subtraction not possible.");
    }

    if (c1 == r2) {
        multiplication(a, b, r1, c1, c2);
    } else {
        System.out.println("Matrix multiplication not possible.");
    }

    transpose(a, r1, c1);

    if (isSquare(a, r1, c1)) {

        System.out.println("Matrix A is a square matrix.");

        if (isDiagonal(a, r1))
            System.out.println("Matrix A is a diagonal matrix.");
        else
            System.out.println("Matrix A is not a diagonal matrix.");

        if (isIdentity(a, r1))
            System.out.println("Matrix A is an identity matrix.");
        else
            System.out.println("Matrix A is not an identity matrix.");

    } else {
        System.out.println("Matrix A is not a square matrix.");
    }

    sc.close();
}
}
