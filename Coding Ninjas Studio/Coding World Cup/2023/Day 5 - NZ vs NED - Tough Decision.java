public class Solution {
    static int xorScore(int a, int b) {
        int score = a ^ b;
        for (int c = 1; c <= a; c++) {
            for (int d = 1; d <= b; d++) {
                if ((c ^ d) > score) {
                    return 1;
                }
            }
        }
        return 0;
    }
}