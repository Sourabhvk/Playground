#include <iostream>
using namespace std;

int main()
{
    int n, rno = 0, rem;
    cin >> n;
    while(n != 0)
    {
        rem = n%10;
       rno = rno*10 + rem;
        n /= 10;
    }

    cout<< rno;

    return 0;
}