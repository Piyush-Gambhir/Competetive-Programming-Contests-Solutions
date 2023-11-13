
int gcd(int m, int n)
{
    while (m != n)
    {
        if (m > n)
            m = m - n;
        else
            n = n - m;
    }

    return m;
}

int minimumJumps(int x, int y)
{
    // Write your code here.
    if (x == 0 && y == 0)
        return 0;

    if (x == 0 || y == 0)
        return 1;

    int k = gcd(x, y);
    int steps = 0;

    int xs = x / k;
    int ys = y / k;

    return (xs + ys);
}