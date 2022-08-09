#include <bits/stdc++.h>
using namespace std;
#define f(i, a, b) for (long long i = a; i < b; i++)
#define rf(i, a, b) for (long long i = a; i >= b; i--)
#define ll long long
#define mp make_pair
#define pb push_back
#define vll vector<long long>
#define vvl vector<vll>
#define pll pair<ll, ll>
#define vc vector
#define fi first
#define se second
#define all(x) x.begin(), x.end()
long long Ceil(long long a, long long b)
{
    return (a + b - 1) / b;
}

int main()
{
    int test;
    cin >> test;
    while (test--)
    {
        ll numbers, xeon, yacht; cin >> numbers >> xeon >> yacht;vll a(numbers);
        f(i, 0, numbers){
                cin >>a[i];} ll robert = 0;
        if (xeon <= yacht)
        {
            ll witch = *max_element(all(a));
            if (witch <= 0){
                cout << 0 << endl;}
            else{
                cout << Ceil(witch, yacht) << endl;}
        }
        else
        {
            f(i, 0, numbers)
                {a[i] = max(a[i], 0ll);}
            ll rahul = 0;
            rf(i, numbers - 1, 0)
            {
                a[i] -= rahul;
                a[i] = max(a[i], 0ll);
                ll ma = Ceil(a[i], xeon);
                rahul += yacht * ma;
                robert += ma;
            }cout << ro << endl;
        }
    }
    return 0;
}
