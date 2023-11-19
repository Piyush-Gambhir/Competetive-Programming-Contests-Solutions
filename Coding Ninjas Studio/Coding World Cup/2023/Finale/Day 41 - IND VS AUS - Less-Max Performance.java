import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private static void updateTree(int node, int startIdx, int endIdx, int targetIdx, int value, int[] tree) {
        if (startIdx == endIdx) {
            tree[node] = value;
            return;
        }

        int mid = (startIdx + endIdx) / 2;
        if (targetIdx <= mid) {
            updateTree(2 * node, startIdx, mid, targetIdx, value, tree);
        } else {
            updateTree(2 * node + 1, mid + 1, endIdx, targetIdx, value, tree);
        }

        tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
    }

    private static int queryTree(int node, int startIdx, int endIdx, int rangeStart, int rangeEnd, int[] tree) {
        if (startIdx > rangeEnd || endIdx < rangeStart) {
            return -1;
        }

        if (rangeStart <= startIdx && endIdx <= rangeEnd) {
            return tree[node];
        }

        int mid = (startIdx + endIdx) / 2;
        return Math.max(queryTree(2 * node, startIdx, mid, rangeStart, rangeEnd, tree),
                queryTree(2 * node + 1, mid + 1, endIdx, rangeStart, rangeEnd, tree));
    }

    public static int[] ninjaAndLessMaxElement(int n, int[] a) {
        int[] segmentTree = new int[4 * n + 8];
        Arrays.fill(segmentTree, -1);

        List<List<Integer>> positions = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            positions.add(new ArrayList<>());
            positions.get(i).add(0);
        }

        for (int i = 0; i < n; i++) {
            positions.get(a[i]).add(i + 1);
        }

        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            if (positions.get(i).size() <= 1)
                continue;

            for (int j = 1; j < positions.get(i).size(); j++) {
                result[positions.get(i).get(j) - 1] = queryTree(1, 1, n, positions.get(i).get(j - 1) + 1,
                        positions.get(i).get(j) - 1, segmentTree);
            }

            for (int j = 1; j < positions.get(i).size(); j++) {
                updateTree(1, 1, n, positions.get(i).get(j), i, segmentTree);
            }
        }

        return result;
    }
}
