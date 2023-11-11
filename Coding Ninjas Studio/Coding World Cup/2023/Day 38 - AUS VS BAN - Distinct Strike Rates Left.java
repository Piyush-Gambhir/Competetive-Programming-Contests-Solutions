import java.util.*;

public class Solution {
    static int distinctLeft(int[] arr, int n, int k) {
        // Write your code here.
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map.size();
    }
}