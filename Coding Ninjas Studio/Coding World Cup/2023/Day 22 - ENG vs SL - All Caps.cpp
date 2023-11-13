long long underwaterValves(int n, vector<int> &h)
{
    // Write your code here.
    unordered_map<int, int> map;
    for (int i = 0; i < n; i++)
        map[h[i]] = i;

    sort(h.begin(), h.end());

    long long time = 0;
    int prev = 0;
    for (int i = 0; i < n; i++)
    {
        time += abs(prev - map[h[i]]);
        prev = map[h[i]];
    }

    return time;
}

