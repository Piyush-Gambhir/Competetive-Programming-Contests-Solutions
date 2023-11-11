public class Solution {
    static int removeBulbs(int[] a) {
        // Write your code here.

        int count = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] == 1) {
                i++;
                continue;
            }

            int j = i;
            while (j < a.length && a[j] == 0) {
                j++;
            }

            if (j == a.length) {
                break;
            }
            int zeroCount = j - i;
            count += zeroCount - 1;
            i = j;
        }
        return count;
    }
}