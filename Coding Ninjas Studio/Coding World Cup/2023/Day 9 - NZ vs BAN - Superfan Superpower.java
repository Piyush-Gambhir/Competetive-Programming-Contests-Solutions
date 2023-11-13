
public class Solution {
    public static int minimumOperations(int x, int y) {
        if (x == 0) {
            return 0;
        }

        int best = Integer.MAX_VALUE;

        for (int t = 0; t * t <= x; t++) {
            if (t == 0 && y == 1) {
                continue;
            }

            int cnt = t, tmp = x;

            while (tmp != 0) {
                tmp /= (y + t);
                cnt++;
            }

            best = Math.min(best, cnt);
        }

        return best;
    }
}
