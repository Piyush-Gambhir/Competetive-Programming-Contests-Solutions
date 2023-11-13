int goodSubarray(vector<int> &a)
{
    int n = a.size();
    int maxLength = 1;

    std::sort(a.begin(),
              a.end());

    int start = 0;
    int end = 1;
    while (end < n)
    {
        if (a[end] - a[start] <= 10)
        {
            maxLength = std::max(maxLength, end - start + 1);
            end++;
        }
        else
        {
            start++;
        }
    }

    return maxLength;
}
