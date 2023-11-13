
public class Solution {
    static int minHours(int[] a) {
        int n = a.length;

        int aMin = a[0], aMax = a[0];
        for (int i = 0; i < n; i++) {
            aMin = Math.min(aMin, a[i]);
            aMax = Math.max(aMax, a[i]);
        }

        int ans = aMax - aMin + Math.min(aMax - a[0], a[0] - aMin);
        return ans;
    }
}
