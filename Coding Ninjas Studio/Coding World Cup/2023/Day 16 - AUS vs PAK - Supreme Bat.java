import java.util.*;

public class Solution {
    static boolean supreme(int w, int x, int y) {
        return w >= x && w <= y;
    }

    static int xAndY(int x, int y, int[] a) {
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (supreme(a[i], x, y)) {
                s.add(a[i]);
            }
        }

        Collections.sort(s);

        if (s.size() == 0) {
            return -1;
        }
        return s.get(0);
    }
}
