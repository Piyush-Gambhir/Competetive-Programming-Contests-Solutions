from typing import *


def boxFilling(n: int, x: int, y: int) -> int:
    # write your code here
    balls = n * x
    if balls % y == 0:
        return balls // y
    return balls // y + 1