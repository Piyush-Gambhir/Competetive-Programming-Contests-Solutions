import java.util.Arrays;

public class Solution {
    static int goodSubarray(int[] a) {
        int n = a.length;
        int maxLength = 1;

        Arrays.sort(a);

        int start = 0;
        int end = 1;
        while (end < n) {
            if (a[end] - a[start] <= 10) {
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                start++;
            }
        }

        return maxLength;
    }
}
