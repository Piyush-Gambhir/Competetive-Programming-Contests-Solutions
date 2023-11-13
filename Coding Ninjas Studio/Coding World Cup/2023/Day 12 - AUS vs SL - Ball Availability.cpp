int productionHouse(int n, int m, vector<int> &days, vector<int> &needs)
{
    // Write your code here.
    int unused = 0;
    for (int i = 0; i < m; i++)
    {
        unused += n;
        if (needs[i] > unused)
            return 0;
        unused -= needs[i];
    }
    return 1;
}

