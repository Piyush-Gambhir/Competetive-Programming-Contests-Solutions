import java.util.*;
import java.lang.*;

class Codechef {
    public static void printMatrix(int[][] mat, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void generateMatrix(int N) {
        int[][] mat = new int[N][N];
        int value = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = value++;
            }
        }

        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                int temp = mat[i][0];
                mat[i][0] = mat[i][N - 1];
                mat[i][N - 1] = temp;
            }
        }

        printMatrix(mat, N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            generateMatrix(N);
        }

        sc.close();
    }
}
