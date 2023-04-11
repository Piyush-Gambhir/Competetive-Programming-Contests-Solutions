import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            int d = in.nextInt();
            int n = s.length();
            int i = 0;
            while (i < n && s.charAt(i) - '0' >= d)
                i++;
            System.out.println(s.substring(0, i) + Integer.toString(d) + s.substring(i));
        }
    }
}