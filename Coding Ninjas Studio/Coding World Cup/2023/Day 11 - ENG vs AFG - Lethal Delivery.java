public class Solution {
    static int maximumSquareDivisor(int n) {
        // Write your code here.
        if (n <= 0) {
            return 0; 
        }

        int maxSquareDivisor = 1;

        for (int i = (int) Math.sqrt(n); i > 0; --i) {
            if (n % (i * i) == 0) {
                maxSquareDivisor = i * i;
                break;
            }
        }

        return (int) Math.sqrt(maxSquareDivisor);
    }
}