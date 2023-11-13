long long bitwiseInclusion(int n, vector<int> &a)
{
    // Write your code here.
    long long sum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            // AND(L, R)
            int L = i, R = j;
            int ba = a[L];
            for (int k = L + 1; k <= R; k++)
            {
                ba = (ba & a[k]);
            }
            if (ba != 0)
            {
                sum += a[L];
            }
        }
    }

    return sum;
}
