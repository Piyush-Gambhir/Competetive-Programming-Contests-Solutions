import java.util.HashSet;
public class Solution {
    static int subsquad(int[] a) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        return set.size();
    }
}
