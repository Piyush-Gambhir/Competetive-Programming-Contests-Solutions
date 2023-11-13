from typing import *


def ballsAndbats(n: int, s: List[int], m: List[int], x: int, y: int) -> int:
    # Write your code here.

    balls = sum(s[:])
    bats = sum(m[:])

    days = 0
    while x > 0 and y > 0:
        x -= balls
        y -= bats
        days += 1

    while x > 0:
        x -= balls
        days += 1

    while y > 0:
        y -= bats
        days += 1

    return days
