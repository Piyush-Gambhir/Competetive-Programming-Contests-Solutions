vector<int> runDivision(int n)
{
    // Write your code here.
    if (n % 2 == 0)
        return vector<int>{n / 2, n / 2};
    else
        return vector<int>{(n / 2) + 1, n / 2};
}

