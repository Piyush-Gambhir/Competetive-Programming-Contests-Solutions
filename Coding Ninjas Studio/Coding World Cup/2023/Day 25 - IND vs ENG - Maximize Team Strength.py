import math


def maximumPower(n: int, arr: list) -> str:
    # Write your code here.
    arr.sort()
    ans = float("-inf")
    for i in range(1, len(arr)):
        ans = max(ans, arr[i - 1] * arr[i])

    return str(ans)
