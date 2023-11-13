import java.util.*;

public class Solution {
    static int maxVariation(int n, int[] v) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (set.contains(v[i])) {
                // v[i] is found in the set
                if (!set.contains(-1 * v[i])) {
                    // -1 * v[i] is not present in the set
                    ans++;
                    set.add(-1 * v[i]);
                }
            } else {
                ans++;
                set.add(v[i]);
            }
        }

        return ans;
    }
}
