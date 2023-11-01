from heapq import heappush, heappop


def dijkstra(n, edges):
    graph = [[] for _ in range(n + 1)]
    for u, v, w in edges:
        graph[u].append((v, w))
        graph[v].append((u, w))

    dist = [float('inf')] * (n + 1)
    dist[1] = 0
    prev = [None] * (n + 1)
    pq = [(0, 1)]

    while pq:
        d, u = heappop(pq)
        if d > dist[u]:
            continue
        for v, w in graph[u]:
            alt = d + w
            if alt < dist[v]:
                dist[v] = alt
                prev[v] = u
                heappush(pq, (alt, v))

    path = []
    at = n
    while at:
        path.append(at)
        at = prev[at]

    return path[::-1] if dist[n] != float('inf') else [-1]


n, m = map(int, input().split())
edges = [tuple(map(int, input().split())) for _ in range(m)]

path = dijkstra(n, edges)

if path == [-1]:
    print(-1)
else:
    print(' '.join(map(str, path)))
