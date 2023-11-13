import java.util.Arrays;

public class Solution {
    static int[] findPair(int x, int y) {
        int a = (x + y) / 2;
        int b = x - a;

        if (a + b == x && a - b == y)
            return new int[]{a, b};

        return new int[]{-1, -1};
    }
}