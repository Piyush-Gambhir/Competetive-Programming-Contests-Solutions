char kthUnique(int n, string &s, int k)
{
    // Write your code here.
    if (k == 0)
        return '?';
    set<char> set;
    vector<char> arr;
    for (int i = 0; i < n; i++)
    {
        int currSize = set.size();
        set.insert(s[i]);
        if (currSize != set.size())
            arr.push_back(s[i]);

        if (k == arr.size())
            return arr[k - 1];
    }

    return '?';
}
