import java.util.*;

public class Solution {
    static int doubleCount(int n, int[] a) {
        // Write your code here.
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                int count = map.get(a[i]);
                map.put(a[i], count + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i] / 2)) {
                answer++;
            }
        }
        return answer;
    }
}