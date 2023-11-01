import java.util.*;
import java.io.*;

public class Solution {

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private static List<List<Pair>> AL = new ArrayList<>();
    private static List<Integer> notvisited = new ArrayList<>();
    private static List<Integer> dist = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            AL.clear();
            for (int i = 0; i <= n; i++) {
                AL.add(new ArrayList<>());
            }

            notvisited.clear();
            dist.clear();
            for (int i = 0; i <= n; i++) {
                notvisited.add(1);
                dist.add(1_000_000_000);
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine().trim());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                AL.get(u).add(new Pair(v, 0));
                AL.get(v).add(new Pair(u, 0));
            }

            List<Integer> odd = new ArrayList<>();
            List<Integer> even = new ArrayList<>();

            int O = 0, E = 0;

            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            dist.set(1, 0);
            even.add(1);
            E++;

            notvisited.set(1, 0);

            while (!q.isEmpty()) {
                int u = q.poll();
                for (Pair pair : AL.get(u)) {
                    int v = pair.first;
                    if (notvisited.get(v) == 1) {
                        notvisited.set(v, 0);
                        q.add(v);
                        dist.set(v, dist.get(u) + 1);
                        if (dist.get(v) % 2 == 0) {
                            E++;
                            even.add(v);
                        } else {
                            O++;
                            odd.add(v);
                        }
                    }
                }
            }

            if (O <= E) {
                bw.write(O + "\n");
                for (int x : odd) {
                    bw.write(x + " ");
                }
            } else {
                bw.write(E + "\n");
                for (int x : even) {
                    bw.write(x + " ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
