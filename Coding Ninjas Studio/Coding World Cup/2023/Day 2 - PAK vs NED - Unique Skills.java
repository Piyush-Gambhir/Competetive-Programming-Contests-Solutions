import java.util.*;

public class Solution {
    static int goodSubsequence(int[] arr) {
        return (countSubseq(arr, 0, new ArrayList<>()) - 1 + 1000000007) % 1000000007;
    }

    private static int countSubseq(int[] arr, int index, List<Integer> subseq) {
        if (index == arr.length) {
            Set<Integer> uniqueSet = new HashSet<>(subseq);
            if (uniqueSet.size() == subseq.size()) {
                return 1;
            } else {
                return 0;
            }
        }
        int exclude = countSubseq(arr, index + 1, new ArrayList<>(subseq));

        subseq.add(arr[index]);
        int include = countSubseq(arr, index + 1, subseq);

        return exclude + include;
    }
}
