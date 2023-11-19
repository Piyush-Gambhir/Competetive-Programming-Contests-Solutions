void updateTree(int node, int startIdx, int endIdx, int targetIdx, int value, vector<int> &tree)
{
    if (startIdx == endIdx)
    {
        tree[node] = value;
        return;
    }

    int mid = (startIdx + endIdx) / 2;
    if (targetIdx <= mid)
    {
        updateTree(2 * node, startIdx, mid, targetIdx, value, tree);
    }
    else
    {
        updateTree(2 * node + 1, mid + 1, endIdx, targetIdx, value, tree);
    }

    tree[node] = max(tree[2 * node], tree[2 * node + 1]);
}

int queryTree(int node, int startIdx, int endIdx, int rangeStart, int rangeEnd, vector<int> &tree)
{
    if (startIdx > rangeEnd || endIdx < rangeStart)
    {
        return -1;
    }

    if (rangeStart <= startIdx && endIdx <= rangeEnd)
    {
        return tree[node];
    }

    int mid = (startIdx + endIdx) / 2;
    return max(queryTree(2 * node, startIdx, mid, rangeStart, rangeEnd, tree),
               queryTree(2 * node + 1, mid + 1, endIdx, rangeStart, rangeEnd, tree));
}

vector<int> ninjaAndLessMaxElement(int n, vector<int> &a)
{
    vector<int> segmentTree(4 * n + 8, -1);
    vector<vector<int>> positions(n + 1, vector<int>(1, 0));

    for (int i = 0; i < n; i++)
    {
        positions[a[i]].push_back(i + 1);
    }

    vector<int> result(n);
    for (int i = 1; i <= n; i++)
    {
        if (positions[i].size() <= 1)
            continue;

        for (int j = 1; j < positions[i].size(); j++)
        {
            result[positions[i][j] - 1] = queryTree(1, 1, n, positions[i][j - 1] + 1,
                                                    positions[i][j] - 1, segmentTree);
        }

        for (int j = 1; j < positions[i].size(); j++)
        {
            updateTree(1, 1, n, positions[i][j], i, segmentTree);
        }
    }

    return result;
}
