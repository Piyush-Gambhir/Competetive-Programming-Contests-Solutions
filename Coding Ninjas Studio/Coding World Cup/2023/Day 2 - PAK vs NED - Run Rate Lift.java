public class Solution {
    static int liftStruggle(int d) {
        if (d == 0)
            return 0;
        int overs = d / 3;
        if (d % 3 == 0) {
            return overs;
        } else {
            return (d % 3 == 1) ? overs + 2 : overs + 4;
        }
    }
}