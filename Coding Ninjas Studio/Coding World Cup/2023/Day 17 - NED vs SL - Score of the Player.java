import java.util.Arrays;

public class Solution {
    static int modifyMex(int n, int[] a) {
        Arrays.sort(a);

        int mex = -1;
        int i = 0;

        for (; i < n; i++) {
            if (a[i] == mex || a[i] == mex + 1) {
                mex = a[i];
            } else {
                break;
            }
        }

        mex++;

        int count = 0;
        int index1 = Arrays.binarySearch(a, mex + 1);
        int index2 = Arrays.binarySearch(a, mex + 2);

        if (index2 >= 0) {
            return -1;
        }
        if (index1 < 0) {
            return 2;
        }

        return 1;
    }
}
