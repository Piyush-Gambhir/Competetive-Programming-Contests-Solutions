public class Solution {
    static int calculateNumberOfDays(String s) {
        int matchesPlayed = 0;
        boolean canPlayNext = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && canPlayNext) {
                matchesPlayed++;   
                canPlayNext = false;  
            } else {
                canPlayNext = true;   
            }
        }
        return matchesPlayed;
    }
}