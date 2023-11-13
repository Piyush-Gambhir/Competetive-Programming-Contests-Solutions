from typing import *

def minDifference(a: List[int]) -> int:
    # Write your code here.
    a.sort()
    m = a[1] - a[0]
    for i in range(0, len(a) - 1):
        m = min(m, a[i + 1] - a[i])
    return m
