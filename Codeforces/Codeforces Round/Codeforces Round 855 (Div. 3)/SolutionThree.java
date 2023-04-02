import java.util.*;

public class SolutionThree {
    private static final String PATTERN = "m+[eE]+o+w+";
    private static final Map<Character, Integer> COUNTS = new HashMap<Character, Integer>() {
        {
            put('m', 1);
            put('M', 1);
            put('e', 2);
            put('E', 2);
            put('o', 1);
            put('O', 1);
            put('w', 1);
            put('W', 1);
        }
    };

    public static boolean isCatMeowing(String s) {
        if (s.length() < 4 || !COUNTS.containsKey(s.charAt(0))) {
            return false;
        }
        int count = COUNTS.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!COUNTS.containsKey(c)) {
                return false;
            }
            if (c == s.charAt(i - 1)) {
                count += COUNTS.get(c);
            } else {
                count = COUNTS.get(c);
            }
            if (count == PATTERN.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            if (isCatMeowing(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
