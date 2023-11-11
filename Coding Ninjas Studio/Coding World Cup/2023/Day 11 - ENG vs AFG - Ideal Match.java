public class Solution {
    static String ninjaAndIdealGas(int r, int o, int n, int t, int i) {
        if (r * o == n * t * i) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
