/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    public static char[][] generateMatrix(int n) {
        if (n % 2 == 1) {
            return null; // no valid matrix exists
        }
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], '0');
            matrix[i][i] = '1';
        }
        for (int j = 0; j < n; j++) {
            if (matrix[j][j] == '1') {
                for (int i = 0; i < n; i++) {
                    if (i != j) {
                        matrix[i][j] = '0';
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (i != j) {
                        matrix[i][j] = '1';
                    }
                }
            }
        }
        // ensure all rows (from left to right) and all columns (from top to bottom) are
        // distinct
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Arrays.equals(matrix[i], matrix[j])) {
                    // swap the i-th row with a row that is different from it
                    int k = i + 1;
                    while (Arrays.equals(matrix[i], matrix[k])) {
                        k++;
                    }
                    char[] temp = matrix[k];
                    matrix[k] = matrix[i];
                    matrix[i] = temp;
                }
                if (matrix[i][j] == matrix[j][i]) {
                    // swap the i-th and j-th columns
                    for (int k = 0; k < n; k++) {
                        char temp = matrix[k][i];
                        matrix[k][i] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            char[][] matrix = generateMatrix(n);
            if (matrix == null) {
                System.out.println("-1");
            } else {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(matrix[j][k]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
