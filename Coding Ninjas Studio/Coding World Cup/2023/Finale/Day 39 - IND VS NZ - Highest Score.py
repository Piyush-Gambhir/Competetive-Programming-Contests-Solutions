from typing import List


def maximumScore(n: int, k: int, a: List[int]) -> int:
    if k == 0:
        return 0

    MOD = 10**9 + 7

    pow2 = [0] * 41
    pow2[0] = 1
    for i in range(1, 41):
        pow2[i] = pow2[i - 1] * 2

    difficulty_dp = [[0] * n for _ in range(n)]

    for i in range(n):
        length = n - k + 1
        removed = n - length
        j = i + n - k
        if j >= n:
            break

        difficulty_dp[i][j] = max(
            a[i], a[j]) * pow2[removed]

    for length in range(n - k + 2, n + 1):
        for i in range(n):
            j = i + length - 1
            removed = n - length

            if j >= n:
                break

            difficulty_dp[i][j] = max(
                a[i] * pow2[removed] + difficulty_dp[i + 1][j],
                a[j] * pow2[removed] + difficulty_dp[i][j - 1]
            )

    return difficulty_dp[0][n - 1] % MOD
