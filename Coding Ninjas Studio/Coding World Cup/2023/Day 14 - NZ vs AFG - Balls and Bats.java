import java.util.*;

public class Solution {
    static int ballsAndbats(int n, int[] s, int[] m, int x, int y) {
        int balls = 0;
        int bats = 0;
        for (int i = 0; i < s.length; i++) {
            balls += s[i];
        }
        for (int i = 0; i < m.length; i++) {
            bats += m[i];
        }

        int days = 0;
        while (x > 0 && y > 0) {
            x -= balls;
            y -= bats;
            days++;
        }

        while (x > 0) {
            x -= balls;
            days++;
        }

        while (y > 0) {
            y -= bats;
            days++;
        }

        return days;
    }
}