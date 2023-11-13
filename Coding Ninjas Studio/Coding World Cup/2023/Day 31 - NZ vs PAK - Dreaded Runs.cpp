int findLen(int n, int x, vector<int> &a)
{
    // Write your code here.
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] != x)
            count++;
    }

    return count;
}
