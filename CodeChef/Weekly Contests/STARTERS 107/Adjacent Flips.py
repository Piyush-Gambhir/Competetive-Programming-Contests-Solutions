def function(s):
    count_0 = s.count('0')
    count_1 = s.count('1')

    if count_0 == 0 or count_1 == 0:
        return "Yes"

    if count_0 % 2 == 0 and count_1 % 2 == 0:
        return "Yes"

    return "No"


T = int(input())
results = []

for _ in range(T):
    N = int(input())
    S = input().strip()

    result = function(S)
    results.append(result)

for result in results:
    print(result)
