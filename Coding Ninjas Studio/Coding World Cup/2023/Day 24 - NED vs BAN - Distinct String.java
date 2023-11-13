import java.util.*;
import java.io.*;

public class Solution {
    static int simpleString(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
                i++;
            }
        }

        return count;
    }
}