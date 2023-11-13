
int maxSum(vector<int> &A)
{
    int maxSum = INT_MIN;
    int N = A.size();

    for (int i = 0; i <= N - 2; i++)
    {
        int currSum = max(A[i], A[i + 1]) + min(A[i], A[i + 1]);
        maxSum = max(maxSum, currSum);
    }

    return maxSum;
}