import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String S = sc.next();
            String K = sc.next();

            int minMoves = Integer.MAX_VALUE;

            for (int i = 0; i <= N - M; i++) {
                int currentMoves = 0;

                for (int j = 0; j < M; j++) {
                    int digitS = Character.getNumericValue(S.charAt(i + j));
                    int digitK = Character.getNumericValue(K.charAt(j));

                    int forward = Math.abs(digitS - digitK);
                    int backward = 10 - forward;

                    currentMoves += Math.min(forward, backward);
                }

                minMoves = Math.min(minMoves, currentMoves);
            }

            System.out.println(minMoves);
        }
    }
}
