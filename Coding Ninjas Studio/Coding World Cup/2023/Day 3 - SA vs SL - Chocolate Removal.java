public class Solution {
    static long totalChocolates(int n, int[] a) {
        // Write your code here.
        int answer = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 23) {
                answer += (a[i] - 23);
            }
        }
        return answer;
    }
}