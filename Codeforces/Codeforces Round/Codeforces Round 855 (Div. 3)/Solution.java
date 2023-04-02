import java.util.*;

public class Solution {
    public static boolean isCatMeowing(String s, int n) {
        if (s.length() < 4 || (s.charAt(0) != 'm' && s.charAt(0) != 'M')) {
            return false;
        }
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == 'M' || s.charAt(i) == 'm') {
                while (i < n && (s.charAt(i) == 'm' || s.charAt(i) == 'M')) {
                    i++;
                }
                if (s.charAt(i) == 'E' || s.charAt(i) == 'e') {
                    while (i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
                        i++;
                    }
                    if (s.charAt(i) == 'O' || s.charAt(i) == 'o') {
                        while (i < n && (s.charAt(i) == 'O' || s.charAt(i) == 'o')) {
                            i++;
                        }
                        if (i < n && s.charAt(i) == 'W' || s.charAt(i) == 'w') {
                            while (i < n && (s.charAt(i) == 'W' || s.charAt(i) == 'w')) {
                                i++;
                            }
                            if (i == n) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (isCatMeowing(s, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}