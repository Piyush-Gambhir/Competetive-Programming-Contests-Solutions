import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        while(T-- > 0) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int H = Integer.parseInt(input[1]);
            
            String[] arr = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(A);
            
            int low = 0, high = A[N-1], ans = high;
            
            while(low <= high) {
                int mid = (low + high) / 2;
                int strength = H;
                boolean canDefeatAll = true;
                
                for(int i = 0; i < N; i++) {
                    if(A[i] > mid) {
                        strength -= A[i];
                        if(strength <= 0) {
                            canDefeatAll = false;
                            break;
                        }
                    }
                }
                
                if(canDefeatAll) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
