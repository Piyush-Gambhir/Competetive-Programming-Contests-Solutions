#include <bits/stdc++.h> 
string stringOperation(string &s, int k){
    // Write your code here
    int operations = 0;
    
    for (char &c : s) {
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            operations++;
        } else {
          continue;
        }
    }

    return (operations == k) ? "YES" : "NO";
}