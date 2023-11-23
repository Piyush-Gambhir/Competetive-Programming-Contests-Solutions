#include <iostream>
#include <vector>
#include <algorithm>

#define ll long long
#define vli vector<ll>

using namespace std;

void solve()
{
    ll n;
    cin >> n;
    vli nums(n);

    ll odd = 0, even = 0;
    for (int i = 0; i < n; i++)
        cin >> nums[i];

    vector<ll> evens, odds;
    vector<ll> result(n, -1);

    for (auto num : nums)
    {
        if (num % 2 != 0)
        {
            odd++;
            odds.push_back(num);
        }
        else
        {
            even++;
            evens.push_back(num);
        }
    }

    if (even % 2 != 0 || odd % 2 != 0)
    {
        cout << "-1";
    }
    else
    {
        sort(evens.begin(), evens.end());
        sort(odds.begin(), odds.end());
        vector<int> oddCount(odd), evenCount(even);

        int k = 0;
        for (auto z : odds)
        {
            oddCount[k] = z;
            k += 2;
            if (k >= odd)
                k = 1;
        }

        k = 0;
        for (auto z : evens)
        {
            evenCount[k] = z;
            k += 2;
            if (k >= even)
                k = 1;
        }

        int itr = 0;
        for (int z = 0; z < odd; z += 2)
        {
            result[itr] = (oddCount[z] + oddCount[z + 1]) / 2;
            result[itr + (n / 2)] = abs(oddCount[z] - oddCount[z + 1]) / 2;
            itr++;
        }

        for (int z = 0; z < even; z += 2)
        {
            result[itr] = (evenCount[z] + evenCount[z + 1]) / 2;
            result[itr + (n / 2)] = abs(evenCount[z] - evenCount[z + 1]) / 2;
            itr++;
        }

        for (auto h : result)
        {
            cout << h << " ";
        }
    }
}

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        solve();
        cout << endl;
    }

    return 0;
}