int checkSequence(int a, int d, int x)
{
    // Write your code here.
    if (d == 0)
        return (x == a);
    return ((x - a) % d == 0 && (x - a) / d >= 0);
}
