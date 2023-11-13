long long totalChocolates(int n, vector<int> a)
{
    // Write your code here.
    long long ans = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > 23)
            ans += a[i] - 23;
    }
    return ans;
}
