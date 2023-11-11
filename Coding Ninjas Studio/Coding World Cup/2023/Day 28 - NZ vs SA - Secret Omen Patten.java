public class Solution {
    static int secretCode(int n, int[] a) {
        for (int i = 0; i < n - 2; i++) {
            if ((a[i] + a[i + 1] + a[i + 2]) % 10 == 0) {
                return 1;
            }
        }
        return 0;
    }
}
