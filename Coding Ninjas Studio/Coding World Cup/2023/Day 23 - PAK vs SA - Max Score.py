from typing import *
import math


def max_sum(arr: List[int]) -> int:
    # write your code here
    n = len(arr)
    s = 0

    for i in range(n):
        for j in range(i + 2, n + 1):
            subarray = arr[i:j]
            subarray.sort()
            s = max(s, subarray[0] + subarray[len(subarray) - 1])

    return s
