import java.util.*;

public class Solution {
    static int planetMisery(int n, int m) {
        // Write your code here.

        return n == m ? 2 * n : 2 * Math.min(n, m) + 1;
    }
}