#include <bits/stdc++.h>
using namespace std;
int result()
{
        int num;
        cin >> num;
        if (num == 3)
        {
            cout << 1 << " " << 2 << " " << 3 << endl;
            return 0;
        }
        cout << num << " " << num - 2 << " ";
        for (int i = 1; i < num - 3; i++)
        {
            cout << i << " ";
        }
        cout << num - 3 << " " << num - 1 << endl;
    return 0;
}
int main(){
    int test_case;
    cin>>test_case;
    while(test_case--){
        result();
    }
}
