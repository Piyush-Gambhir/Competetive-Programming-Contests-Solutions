#include <iostream>
#include <cmath>

bool is_prime(int n)
{
    if (n <= 1)
        return false;
    if (n == 2 || n == 3)
        return true;
    if (n % 2 == 0 || n % 3 == 0)
        return false;

    for (int i = 5; i * i <= n; i += 6)
    {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }
    return true;
}

std::string winner(int N)
{
    if (N % 2 == 0)
        return "Bob";
    if (is_prime(N))
        return "Alice";

    for (int p = 3; p <= N; p += 2)
    {
        if (N % p == 0 && is_prime(p))
            return "Alice";
    }
    return "Bob";
}

int main()
{
    int T;
    std::cin >> T;

    for (int t = 0; t < T; ++t)
    {
        int N;
        std::cin >> N;
        std::cout << winner(N) << std::endl;
    }

    return 0;
}
