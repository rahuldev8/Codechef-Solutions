#include <bits/stdc++.h>
using namespace std;

int solution(){
    int num;
        cin >> num;
        vector<int>array; 
        map<int,int>map_array; 
        
        for(int x = 0 ; x < num; x++)
        
        {
            int value;
            cin >> value;
            map_array[value]++;
            
        }
        for(auto ss : map_array) 
        
        {
            array.push_back(ss.second);
            
        }
        
        if(array.size() == 1) 
        {
             cout << "YES" << endl;return 0;
        }
        sort((array).begin(), (array).end());
        
        if(array[array.size() -1 ] > array[array.size()-2]) cout << "YES" << endl;
        else cout << "NO" << endl;
        return 0;
}


int main() 
{
    int test;
	cin>>test;
	while(test--) 
	solution();
}
