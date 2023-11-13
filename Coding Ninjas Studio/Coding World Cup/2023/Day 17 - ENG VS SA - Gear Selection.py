from typing import *


def gearSelection(n: int) -> int:
    # Write your code here.
    count = n * (n - 1) // 2
    return 2*count
