int minOperations(int x, int a, int b)
{
    // Write your code here.
    if (a > b)
        return -1;

    int count = 0;
    int m = x;
    int n = 0;

    while (a < b)
    {
        m += a;
        n += b;
        count++;
        if (m == n)
            return count;
        else if (m > n && m - a < n - b)
            return -1;
        else if (m < n && m - a > n - b)
            return -1;
    }

    return -1;
}

