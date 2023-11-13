import java.util.*;

public class Solution  {
    public static long underWaterValves(int n, int []h) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(h[i], i);

        Arrays.sort(h);

        long time = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            time += Math.abs(prev - map.get(h[i]));
            prev = map.get(h[i]);
        }

        return time;
    }
}