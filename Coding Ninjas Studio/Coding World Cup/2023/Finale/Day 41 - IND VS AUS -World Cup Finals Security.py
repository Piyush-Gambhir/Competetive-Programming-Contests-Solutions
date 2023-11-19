from typing import List


def terminalDefence(n: int, m: int, a: List[int], h: List[int], b: List[int], k: int) -> int:
    # write your code here

    i, j, l = 0, 0, 0
    C = [0] * (n + m)

    while i < m or j < n:
        if i != m and (j == n or a[i] < b[j]):
            C[l] = (h[i] + k - 1) // k
            i += 1
        else:
            C[l] = -1
            j += 1
        l += 1

    cnt = req = 0
    left = right = 0

    for i in range(n + m):
        if C[i] == -1:
            cnt += 1
            if cnt + req > n:
                right = n - cnt
            else:
                left += 1
        elif C[i] > left + right:
            if cnt + req > n or C[i] > n:
                return 0
            req = max(req, C[i] - left)
    return 1
