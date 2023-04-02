import java.util.*;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            Map<Character, Integer> count = new HashMap<>();
            for (char c : s.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            int burls = 0;
            for (char c : count.keySet()) {
                if (Character.isUpperCase(c)) {
                    char lc = Character.toLowerCase(c);
                    if (count.containsKey(lc)) {
                        int pairs = Math.min(count.get(c), count.get(lc));
                        burls += pairs;
                        count.put(c, count.get(c) - pairs);
                        count.put(lc, count.get(lc) - pairs);
                    }
                }
            }

            for (char c : count.keySet()) {
                if (Character.isUpperCase(c)) {
                    char lc = Character.toLowerCase(c);
                    if (count.containsKey(lc) && k > 0) {
                        int pairs = Math.min(count.get(c), count.get(lc));
                        pairs = Math.min(pairs, k);
                        burls += pairs;
                        k -= pairs;
                    }
                }
            }

            System.out.println(burls);
        }
    }
}
