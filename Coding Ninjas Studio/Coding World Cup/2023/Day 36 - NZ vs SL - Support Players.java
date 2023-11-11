import java.util.*;
import java.io.*;

public class Solution {
    static String stringOperation(String s, int k) {
        // Write your code here.
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int changesNeeded = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!vowels.contains(s.charAt(i))) {
                changesNeeded++;
            }
        }

        if (changesNeeded <= k && k <= s.length()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}