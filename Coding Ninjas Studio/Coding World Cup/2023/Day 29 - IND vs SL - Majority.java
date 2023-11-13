import java.util.HashMap;

public class Solution {
    public static int maximumLength(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 1;
        int ele = a[0];

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            if (map.get(a[i]) > maxCount) {
                maxCount = map.get(a[i]);
                ele = a[i];
            }
        }

        int remainingSum = 0;
        for (int value : map.values()) {
            remainingSum += value;
        }
        remainingSum -= maxCount;

        while (maxCount < remainingSum) {
            remainingSum--;
        }

        return maxCount + remainingSum;
    }
}
