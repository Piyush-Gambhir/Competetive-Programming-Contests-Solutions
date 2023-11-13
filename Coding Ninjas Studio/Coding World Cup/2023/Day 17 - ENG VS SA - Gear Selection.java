public class Solution {
    static int gearSelection(int n) {
        int count = n * (n - 1) / 2;
        return 2 * count;
    }
}