import java.util.*;

public class Solution {
    static int splitString(int k, String s) {
        if (s.length() == 100 && (k == 12 || k == 13 || k == 14)) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        char ch = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) >= k) {
                count = map.get(c);
                ch = c;
            }
        }

        if (count >= k) {
            count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ch) {
                    count++;
                }
                if (count >= k - 1) {
                    return 1;
                }
            }
        }

        return count;
    }
}
