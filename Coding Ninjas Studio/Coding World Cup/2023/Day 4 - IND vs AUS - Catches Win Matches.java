public class Solution {
    static int kaiserImpact(int n, int m, int a, int b, int w, double k) {
        if (k == 0) {
            return 0;
        }

        int x = 0;
        double y = 0;

        x = a;
        y = k * x;

        if (y <= b + w) {
            return 1;
        }

        return 0;
    }
}