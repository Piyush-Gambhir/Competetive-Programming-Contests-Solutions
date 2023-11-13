int nines(int n, vector<int> &a, int k)
{
    // Write your code here.
    int count = 0, i = 0;
    while (count != k && i < a.size())
    {
        if (a[i] == 9)
            count++;
        i++;
    }
    if (count == k)
        return 1;
    return 0;
}
