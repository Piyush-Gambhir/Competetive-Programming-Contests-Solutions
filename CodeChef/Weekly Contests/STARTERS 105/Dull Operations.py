# cook your dish here
def find_pair(N):
    # Initialize x and y to 0
    x = 0
    y = 0

    # Initialize a variable to keep track of the position
    position = 0

    while N > 0:
        # Check if the least significant bit of N is 1
        if N % 2 == 1:
            # If it's 1, set the corresponding bit of x to 1 (OR operation)
            x |= (1 << position)

        # Move to the next bit
        N //= 2
        position += 1

    # Now, we need to find a value for y such that (x | y) ^ (x & y) = N
    # Let's set y to the complement of x
    y = ~x

    return x, y

# Input the number of test cases
T = int(input())

for _ in range(T):
    N = int(input())
    x, y = find_pair(N)
    print(x, y)
