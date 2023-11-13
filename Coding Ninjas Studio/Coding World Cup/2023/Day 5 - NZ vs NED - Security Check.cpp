int planetMisery(int n, int m)
{
    // Write your code here
    int small = n < m ? n : m;
    int diff = abs(n - m);

    if (diff == 0 || diff == 1)
        return n + m;
    if (diff > 1)
        return small * 2 + 1;
}
