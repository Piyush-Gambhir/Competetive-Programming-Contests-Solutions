public class Solution {
    static long subArrayLast(int n, int[] x) {
        long sum = 0;
        for (int i = 0; i < n; i++) {

            long contribution = (long) x[i] * (i + 1);
            sum += contribution;
        }
        return sum;
    }
}
