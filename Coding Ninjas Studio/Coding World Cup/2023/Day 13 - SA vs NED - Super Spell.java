import java.util.Arrays;

public class Solution {
    static int candies(int[] a) {
        // Write your code here.
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] >= a[i]) {
                return 0;
            }
        }
        return 1;
    }
}