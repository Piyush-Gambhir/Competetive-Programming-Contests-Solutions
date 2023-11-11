import java.util.*;

public class Solution {
    static int replaceElements(int[] a) {
        // Write your code here.
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = a.length;

        if (n % 2 != 0) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                count++;
            }
        }

        return count % 2 == 0 ? count / 2 : count / 2 + 1;
    }
}