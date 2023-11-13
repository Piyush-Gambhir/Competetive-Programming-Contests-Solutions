from typing import *


def goodSubsequence(arr: List[int]) -> int:
    # write your code here.
    def count_subseq(index, subseq):
        if index == len(arr):
            # count the number of unique elements in the subsequence
            unique_set = set(subseq)
            if len(unique_set) == len(subseq):
                return 1
            else:
                return 0

        # exclude the current element
        exclude = count_subseq(index + 1, subseq)

        # include the current element
        include = count_subseq(index + 1, subseq + [arr[index]])

        # total count is the sum of including and excluding the current element
        return exclude + include

    return (count_subseq(0, []) - 1) % 1000000007
