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
            int count = 0;
            StringBuilder x = new StringBuilder();
            if (s.charAt(0) == '0') {
                x.append('1');
                count++;
            } else {
                x.append('0');
            }
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '0') {
                    if (x.charAt(i - 1) == '1') {
                        x.append('0');
                    } else {
                        x.append('1');
                        count++;
                    }
                } else {
                    if (x.charAt(i - 1) == '0') {
                        x.append('1');
                        count++;
                    } else {
                        x.append('0');
                    }
                }
            }
            System.out.println(count);
        }
    }
}