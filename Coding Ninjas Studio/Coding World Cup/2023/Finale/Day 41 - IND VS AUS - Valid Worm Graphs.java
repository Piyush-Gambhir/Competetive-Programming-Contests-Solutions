import java.util.*;

public class Solution {

    private static long modInverse(long number, long modulus) {
        long[] multiplicativeInverse = new long[(int) number + 1];
        multiplicativeInverse[0] = multiplicativeInverse[1] = 1;

        for (int i = 2; i <= number; i++) {
            multiplicativeInverse[i] = multiplicativeInverse[(int) (modulus % i)] * (modulus - modulus / i) % modulus;
        }

        return multiplicativeInverse[(int) number];
    }

    private static void dfsFirstTraversal(int vertex, List<List<Integer>> graph, boolean[] visited,
            List<Integer> order) {
        visited[vertex] = true;

        for (int neighbor : graph.get(vertex)) {
            if (!visited[neighbor]) {
                dfsFirstTraversal(neighbor, graph, visited, order);
            }
        }

        order.add(vertex);
    }

    private static void dfsSecondTraversal(int vertex, int representative, IntWrapper cycleSize,
            List<List<Integer>> reverseGraph,
            boolean[] visited, int[] representatives) {
        visited[vertex] = true;
        representatives[vertex] = representative;
        cycleSize.value++;

        for (int neighbor : reverseGraph.get(vertex)) {
            if (!visited[neighbor]) {
                dfsSecondTraversal(neighbor, representative, cycleSize, reverseGraph, visited, representatives);
            }
        }
    }

    private static void dfsSuffixArray(int vertex, int modulo, int inverseK, int k, List<List<Integer>> tree,
            long[][] dp, long[][] suffixArray) {
        Arrays.fill(dp[vertex], inverseK);

        for (int neighbor : tree.get(vertex)) {
            dfsSuffixArray(neighbor, modulo, inverseK, k, tree, dp, suffixArray);

            for (int j = 0; j < k; j++) {
                dp[vertex][j] = dp[vertex][j] * suffixArray[neighbor][j] % modulo;
            }
        }

        suffixArray[vertex][k - 1] = dp[vertex][k - 1];
        for (int j = k - 2; j >= 0; j--) {
            suffixArray[vertex][j] = (suffixArray[vertex][j + 1] + dp[vertex][j]) % modulo;
        }
    }

    static int randomlySorted3(int numVertices, int numEdges, int[][] edges, int upperLimitRandom) {
        final int modulo = 1_000_000_007;
        int inverseK = (int) modInverse(upperLimitRandom, modulo);
        long[] powers = new long[numVertices];

        powers[0] = 1;
        for (int i = 1; i < numVertices; i++) {
            powers[i] = (powers[i - 1] * inverseK) % modulo;
        }

        List<List<Integer>> graph = new ArrayList<>();
        List<List<Integer>> reverseGraph = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            graph.add(new ArrayList<>());
            reverseGraph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            reverseGraph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[numVertices];
        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                dfsFirstTraversal(i, graph, visited, order);
            }
        }

        Collections.reverse(order);
        Arrays.fill(visited, false);

        long cycleProduct = 1;
        int[] representatives = new int[numVertices];

        for (int vertex : order) {
            if (!visited[vertex]) {
                IntWrapper cycleSize = new IntWrapper();
                dfsSecondTraversal(vertex, vertex, cycleSize, reverseGraph, visited, representatives);
                cycleProduct = (cycleProduct * powers[cycleSize.value - 1]) % modulo;
            }
        }

        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            tree.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if (representatives[u] != representatives[v]) {
                tree.get(representatives[u]).add(representatives[v]);
            }
        }

        long[][] dp = new long[numVertices][upperLimitRandom];
        long[][] suffixArray = new long[numVertices][upperLimitRandom];

        dfsSuffixArray(representatives[order.get(0)], modulo, inverseK, upperLimitRandom, tree, dp, suffixArray);
        return (int) ((cycleProduct * suffixArray[representatives[order.get(0)]][0]) % modulo);
    }

    // Helper class for integer wrapper
    private static class IntWrapper {
        int value;
    }
}
