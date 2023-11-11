public class Solution {
    static int makeInnocent(String a) {
        // Write your code here.
        int changes = 0;
        for (int i = 0; i < a.length() - 2; i++) {
            if (a.charAt(i) == a.charAt(i + 1) && a.charAt(i) == a.charAt(i + 2)) {
                changes++;
                i += 2;
            }
        }
        return changes;
    }
}