/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static String getMinimumLengthString(String u) {
        int[] freq = new int[26];
        for (int i = 0; i < u.length(); i++) {
            freq[u.charAt(i) - 'a']++;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                s.append((char) ('a' + i));
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 0) {
                for (int j = 0; j < freq[i] / 2; j++) {
                    s.insert(0, (char) ('a' + i));
                    s.append((char) ('a' + i));
                }
            } else {
                for (int j = 0; j < freq[i] / 2; j++) {
                    s.insert(s.length() / 2, (char) ('a' + i));
                    s.insert(s.length() / 2 + 1, (char) ('a' + i));
                }
            }
        }
        return s.toString();
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            String U = sc.next();

            String S = getMinimumLengthString(U);
            System.out.println(S);
        }
    }
}
