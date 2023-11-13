public class Solution {
    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }

    static int isPossible(String s) {
        int n = s.length();
        int v = 0, c = 0;

        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i)))
                v++;
            else
                c++;
        }

        if (v >= c)
            return 1;
        return 0;
    }
}