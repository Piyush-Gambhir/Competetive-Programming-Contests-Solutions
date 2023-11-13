from typing import *


def doubleBeauty(k: int, a: List[int]) -> int:
    # write your code here
    n = len(a)
    a.sort()
    s = 0

    for i in range(k):
        s += a[n - 1 - i] * 2

    return s


