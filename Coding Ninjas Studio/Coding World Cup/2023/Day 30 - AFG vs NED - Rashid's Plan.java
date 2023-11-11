public class Solution {
    static int countEvenParityDigits(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) - '0') % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
