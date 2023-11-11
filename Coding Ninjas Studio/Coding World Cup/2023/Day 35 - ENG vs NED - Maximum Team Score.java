public class Solution {
    static long maximumAggregateCount(int n, int[] a) {
        long leftSum = 0;
        long rightSum = 0;

        for (int playerScore : a) {
            rightSum += playerScore;
        }

        long maxScore = 0;

        for (int i = 0; i < n - 1; i++) {
            leftSum += a[i];
            rightSum -= a[i];
            long localMax = Math.max(leftSum, rightSum);
            maxScore = Math.max(maxScore, localMax);
        }

        return maxScore;
    }
}
