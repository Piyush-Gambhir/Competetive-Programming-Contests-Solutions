import java.util.*;
import java.io.*;

public class Solution {
    static String stringOperation(String s, int k) {
        int operations = 0;

        for (char c : s.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                operations++;
            }
        }

        return (operations == k) ? "YES" : "NO";
    }
}
