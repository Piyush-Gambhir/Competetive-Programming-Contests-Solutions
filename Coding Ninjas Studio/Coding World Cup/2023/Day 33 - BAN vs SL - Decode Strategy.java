public class Solution {
    static String decodeString(String s) {
        String ans = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'z') {
                ans += 'a';
            } else {
                ans += (char) (s.charAt(i) + 1);
            }
        }

        return ans;
    }
}