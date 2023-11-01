import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i <= N - K; i++) {
                boolean foundOdd = false;
                for (int j = i; j < i + K; j++) {
                    if (arr[j] % 2 != 0) {
                        foundOdd = true;
                        break;
                    }
                }
                if (foundOdd) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
