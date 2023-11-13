public class Solution {
    static int minimumTime(int x, int y, int z) {
        int lastArrivalTime = 0;
        int t = 0;

        while (x > 0 || y > 0 || z > 0) {
            if (x > 0) {
                x -= Math.min(2, x);
                lastArrivalTime = t;
            }
            t++;
            if (y > 0) {
                y -= Math.min(2, y);
                lastArrivalTime = t;
            }
            t++;
            if (z > 0) {
                z -= Math.min(2, z);
                lastArrivalTime = t;
            }
            t++;
        }
        return lastArrivalTime + 30;
    }
}
