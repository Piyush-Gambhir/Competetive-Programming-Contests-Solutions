import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            int totalRuns = 0;
            int totalBalls = 0;
            for (int i = 0; i < N; i++) {
                totalRuns += arr[i];
                totalBalls++;
                if (totalRuns * 100 == totalBalls * 100) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
