import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef {
    private static List<Integer> findPath(Map<Integer, Map<Integer, Integer>> tree, int start, int end) {
        Map<Integer, Integer> parent = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == end) {
                List<Integer> path = new ArrayList<>();
                path.add(node);
                while (node != start) {
                    path.add(parent.get(node));
                    node = parent.get(node);
                }
                Collections.reverse(path);
                return path;
            }
            Map<Integer, Integer> neighbors = tree.get(node);
            if (neighbors != null) {
                for (int neighbor : neighbors.keySet()) {
                    if (!visited.contains(neighbor)) {
                        parent.put(neighbor, node);
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Map<Integer, Integer>> tree = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                tree.computeIfAbsent(u, k -> new HashMap<>()).put(v, w);
                tree.computeIfAbsent(v, k -> new HashMap<>()).put(u, w);
            }
            List<Integer> path1 = findPath(tree, 1, 2);
            if (path1 == null) {
                System.out.println("-1 -1 -1 -1");
                continue;
            }
            int a = path1.get(path1.size() / 2 - 1);
            int b = path1.get(path1.size() / 2);
            List<Integer> path2 = findPath(tree, 1, a);
            int c, d;
            if (path2.size() % 2 == 0) {
                c = path2.get(path2.size() / 2 - 1);
                d = path2.get(path2.size() / 2);
            } else {
                c = path2.get(path2.size() / 2);
                d = path2.get(path2.size() / 2 + 1);
            }
            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }
}