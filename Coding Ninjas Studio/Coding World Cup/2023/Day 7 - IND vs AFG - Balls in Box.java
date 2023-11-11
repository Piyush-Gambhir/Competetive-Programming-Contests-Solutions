public class Solution {
    static int boxFilling(int n, int x, int y) {
        int totalBalls = n * x;
        int boxesNeeded = totalBalls / y;
        if (totalBalls % y != 0) {
            boxesNeeded++;
        }
        return boxesNeeded;
    }
}
