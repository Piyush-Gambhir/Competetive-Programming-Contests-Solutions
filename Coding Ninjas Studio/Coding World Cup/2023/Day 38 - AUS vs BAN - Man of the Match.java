import java.util.*;

public class Solution {
    public static int happyPlayers(int[] balls) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ball : balls) {
            map.put(ball, map.getOrDefault(ball, 0) + 1);
        }

        int maxAwardSize = -1;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                maxAwardSize = Math.max(maxAwardSize, entry.getKey());
            }
        }

        return maxAwardSize;

    }
}