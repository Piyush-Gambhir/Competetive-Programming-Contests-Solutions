int maxSwap(vector<int> &a)
{
    // Write your code here
    int n = a.size();
    int m = a[1];

    for (int i = 1; i <= n - 2; i++)
        m = max(m, a[i]);

    return max(a[0] + a[n - 1], max(m + a[0], m + a[n - 1]));
}

