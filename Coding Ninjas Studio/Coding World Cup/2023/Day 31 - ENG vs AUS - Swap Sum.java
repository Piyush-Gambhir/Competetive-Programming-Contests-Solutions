import java.util.Arrays;

public class Solution {
    static int swapSum(int k, int[] a, int[] b) {
        int n = a.length;
        int[] diff = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = b[i] - a[i];
            sum += a[i];
        }

        Arrays.sort(diff);

        for (int i = n - 1; k > 0 && i >= 0; i--) {
            if (diff[i] > 0) {
                sum += diff[i];
                k--;
            }
        }

        return sum;
    }
}
