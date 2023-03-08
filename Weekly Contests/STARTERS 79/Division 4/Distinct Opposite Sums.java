import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim()); // even integer N
            int[] p = new int[n]; // permutation P of length N

            for (int i = 0; i < n / 2; i++) {
                p[i] = i * 2 + 2;
                p[n - i - 1] = i * 2 + 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(p[i]).append(" ");
            }
            bw.write(sb.toString().trim());
            bw.newLine();
        }
        bw.flush();
    }
}
