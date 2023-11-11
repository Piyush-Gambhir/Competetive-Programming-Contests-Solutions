public class Solution {
    static int[] runDivision(int n) {
        int[] runs = new int[2];
        runs[1] = n / 2;
        runs[0] = n - runs[1];
        return runs;
    }
}
