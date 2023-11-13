import java.util.HashSet;

public class Solution {
    static int dejaVu(int n, int[] w, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] p = new int[n];
        p[0] = w[0];
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + w[i];
            for (int j = i - 1; j >= 0; j--) {
                if (Math.abs(p[i] - p[j]) <= k) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}