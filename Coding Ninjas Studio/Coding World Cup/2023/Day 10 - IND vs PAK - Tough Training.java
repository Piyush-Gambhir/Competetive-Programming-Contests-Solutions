public class Solution {
    static int checkSequence(int a, int d, int x) {
        if (d == 0) {
            return (x == a) ? 1 : 0;
        }
        return ((x - a) % d == 0 && (x - a) / d >= 0) ? 1 : 0;
    }
}