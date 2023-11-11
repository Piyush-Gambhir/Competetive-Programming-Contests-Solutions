import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    static int basicGame(int n, int k, ArrayList<Integer> a) {
        Collections.sort(a);
        int goodPairs = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i + 1) - a.get(i) <= k) {
                goodPairs++;
            }
        }
        return goodPairs;
    }
}