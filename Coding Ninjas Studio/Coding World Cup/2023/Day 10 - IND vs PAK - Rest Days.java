import java.util.Arrays;

public class Solution {
    static String ninjaWantsHoliday(int n, int k, int []a) {
        Arrays.sort(a);
        int count = 1;
        int start = a[0];

        for (int i = 1; i < n; i++) {
            if (start + 1 == a[i]) {
                count += 1;
                start = a[i];
            } else {
                start = a[i];
                count = 1;
            }

            if (count == k) {
                return "YES";
            }
        }

        return "NO";
    }
}