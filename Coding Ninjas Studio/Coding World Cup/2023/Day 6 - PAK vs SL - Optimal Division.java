import java.util.ArrayList;
import java.util.List;

public class Solution {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int primeSum(int n, int m, int[] a) {
        List<List<Integer>> results = new ArrayList<>();
        generateSubsequences(results, new ArrayList<>(), a, 0, m);
        int count = 0;
        for (List<Integer> item : results) {
            if (isPrime(sum(item))) {
                count++;
            }
        }
        return count;
    }

    static void generateSubsequences(List<List<Integer>> results, List<Integer> current, int[] arr, int index, int m) {
        if (m == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        if (index == arr.length) {
            return;
        }
        current.add(arr[index]);
        generateSubsequences(results, current, arr, index + 1, m - 1);
        current.remove(current.size() - 1);
        generateSubsequences(results, current, arr, index + 1, m);
    }

    static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
