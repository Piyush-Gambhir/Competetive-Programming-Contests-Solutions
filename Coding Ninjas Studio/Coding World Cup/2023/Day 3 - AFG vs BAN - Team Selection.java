public class Solution {
    public static int nines(int n, int[] a, int k) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 9) {
                count++;
            }
        }

        if (count >= k) {
            return 1;
        }
        return 0;
    }
}