public class Solution {
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static int minimumJumps(int x, int y) {
        if (x == 0 && y == 0)
            return 0;

        if (x == 0 || y == 0)
            return 1;

        int k = gcd(x, y);
        int steps = 0;

        int xs = x / k;
        int ys = y / k;

        return (xs + ys);
    }
}
