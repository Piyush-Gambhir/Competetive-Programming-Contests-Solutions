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
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();

            int plusCount = 0, minusCount = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '+') {
                    plusCount++;
                } else if (c == '-') {
                    minusCount++;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                if (c == '0') {
                    sb.append('0');
                } else if (c == '+') {
                    sb.append(plusCount > minusCount ? '+' : '0');
                } else if (c == '-') {
                    sb.append(plusCount < minusCount ? '-' : '0');
                }
            }
            
            

                System.out.println(count);
            }
        }
    }
}