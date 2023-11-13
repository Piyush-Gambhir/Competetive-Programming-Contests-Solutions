def maxDifference(m: int, a: list) -> int:
    # Write your solution here.
    a.sort()
    minimum = sum(a[:m])
    maximum = sum(a[-m:])
    return maximum - minimum