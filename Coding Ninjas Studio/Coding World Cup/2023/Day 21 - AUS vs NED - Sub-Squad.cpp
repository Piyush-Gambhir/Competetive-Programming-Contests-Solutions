int subsquad(vector<int> &a)
{
    // Write your code here.
    unordered_set<int> set;
    for (int i = 0; i < a.size(); i++)
        set.insert(a[i]);
    return set.size();
}

