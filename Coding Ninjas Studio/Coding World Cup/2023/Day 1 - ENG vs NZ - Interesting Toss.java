import java.util.*;

public class Solution {
    static int coinGame(int x, int y) {
        int turn = 0;
        
        while (x >= 3 && y > 0) {
            x -= 3;
            y--;
            turn++;
        }
        return turn % 2 != 0 ? 1 : 0;
    }
}
