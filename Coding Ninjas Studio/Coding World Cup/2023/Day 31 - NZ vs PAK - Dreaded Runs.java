public class Solution {
    public static int findLen(int n, int x, int[] a) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        return n - count;
    }
}