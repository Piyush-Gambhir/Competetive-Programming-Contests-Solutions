/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    static final int MOD = 1000000007;
    static final int INF = 0x3f3f3f3f;
    static final long LINF = 0x3f3f3f3f3f3f3f3fL;
    static final double EPS = 1e-9;
    static int TEST_NO = 1;
    static int n, n1, n2;
    static int[] loser = new int[1000006];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static void precompute() {
        int d = 0;
        for (int i = 0; i < 1000006; ++i) {
            if (loser[i] != 0)
                continue;
            loser[i] = i + d;
            if (i + d < 1000006)
                loser[i + d] = i;
            d++;
        }
    }

    static void read() throws Exception {
        st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
    }

    static void preprocess() {
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
    }

    static void solve() {
        if (n2 == loser[n1])
            System.out.println("Don't Play");
        else
            System.out.println("Play");
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        precompute();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X > Y) {
                int temp = X;
                X = Y;
                Y = temp;
            }
            if (X == loser[Y]) {
                System.out.println("CHEFINA");
            } else {
                System.out.println("CHEF");
            }
        }
    }
}
