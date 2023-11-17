def is_fair_distribution(N, S):
    alice_toys = 0
    bob_toys = 0

    for i in range(N):
        if S[i] == '1':
            alice_toys += 1
        else:
            bob_toys += 1

        if abs(alice_toys - bob_toys) > 1:
            return "NO"

    return "YES"
    
T = int(input().strip())
for _ in range(T):
    N = int(input().strip())
    S = input().strip()
    print(is_fair_distribution(N, S))