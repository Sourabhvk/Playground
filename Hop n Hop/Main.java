#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int xcord,ycord,dist;
cin >> xcord;
cin >> ycord;
dist= sqrt(pow(xcord - 3, 2) +  
                pow(ycord - 4, 2) * 1.0);
cout<<dist;
return 0;
}