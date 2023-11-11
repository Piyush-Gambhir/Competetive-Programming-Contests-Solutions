import java.util.*;

public class Solution {
    static int stringReduction(String s) {
        // Write your code here.
        int answer = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                answer++;
            }
        }
        return answer;
    }
}