long long baitAndSwitch(int n, vector<int> &a, int k, int m)
{
    // Write your code here.
    vector<int> diff;
    for (int i = 0; i < n; i++)
    {
        diff.push_back(abs(a[i] - m));
    }

    sort(diff.begin(), diff.end());

    long long s = 0;
    for (int i = 0; i < k; i++)
    {
        s += diff[n - 1 - i];
    }

    return s;
}

