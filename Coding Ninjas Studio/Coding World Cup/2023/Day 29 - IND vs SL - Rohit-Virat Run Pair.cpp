vector<int> findPair(int x, int y)
{
    // Write your code here.
    int a = (x + y) / 2;
    int b = x - a;

    if (a + b == x && a - b == y)
        return vector<int>{a, b};

    return vector<int>{-1, -1};
}
