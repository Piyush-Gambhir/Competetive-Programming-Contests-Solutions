int buildingBuilder(int n, vector<int> &a)
{
    // Write your code here
}

int buildingBuilder(int n, vector<int> &a)
{
    int stadiums = 0;
    int floors_built = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] == floors_built + 1)
        {
            floors_built++;
            if (floors_built == 5)
            {
                stadiums++;
                floors_built = 0;
            }
        }
    }
    return stadiums;
}
