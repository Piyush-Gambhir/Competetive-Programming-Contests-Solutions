/*
Chef came across a new online judge that has 
�
N problems, and decided that he wants to solve them.

Chef takes 
�
�
A 
i
​
  consecutive minutes to solve the 
�
i-th problem, and will take a break of 
�
�
B 
i
​
  minutes immediately after solving it.
That is, Chef will solve a problem, then take a break. Solve another problem, then take another break, and so on.

Chef has 
�
K minutes of free time. If he chooses the problems and their order optimally, what is the maximum number of problems he can solve in this time?

Note that a problem is considered solved if Chef finishes solving it by the 
�
K-th minute, even if the break time of the last problem extends past minute 
�
K. See the sample tests below for an example.
*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] a = new int[N];
            int[] b = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                b[i] = sc.nextInt();
            }

            int ans = 0;
            int time = 0;
            for (int i = 0; i < N; i++) {
                time += a[i];
                if (time > K) {
                    break;
                }
                time += b[i];
                ans++;
            }
            System.out.println(ans);
        }
    }
}
