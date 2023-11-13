import java.util.*;

public class Solution {
    static char kthUnique(int n, String s, int k) {
        if (k == 0)
            return '?';
        Set<Character> set = new HashSet<>();
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currSize = set.size();
            set.add(s.charAt(i));
            if (currSize != set.size())
                arr.add(s.charAt(i));

            if (k == arr.size())
                return arr.get(k - 1);
        }

        return '?';
    }
}