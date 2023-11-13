import java.util.*;

public class Solution {
    static int maxEvenSum(int n, int[] a) {
        // Write your code here.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                arr.add(a[i]);
        }

        if (arr.size() == 1)
            return -1;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                set.add(arr.get(i) + arr.get(j));
            }
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (set.contains(arr.get(i)))
                return arr.get(i) == 0 ? -1 : arr.get(i);
        }

        return -1;
    }
}
