from typing import List


def ninjaWantsHoliday(n: int, k: int, a: List[int]) -> str:
    # Write your code here.
    a.sort()
    count = 1
    start = a[0]

    for i in range(1, n):
        if start + 1 == a[i]:
            count += 1
            start = a[i]
        else:
            start = a[i]
            count = 1

        if count == k:
            return "YES"

    return "NO"


