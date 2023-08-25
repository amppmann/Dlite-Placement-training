import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[5][5];
        int[][] b = new int[5][5];
        int n, i, j, m;
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        System.out.printf("Enter the value of %d X %d matrix:\n", n, n);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                b[i][j] = a[i][j];
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(b, n);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    for (m = 0; m < n; m++) {
                        b[i][m] = 0;
                        b[m][j] = 0;
                    }
                }
            }
        }
        System.out.println("Matrix after setting rows and columns to zero:");
        printMatrix(b, n);
    }
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
