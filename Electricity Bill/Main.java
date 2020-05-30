#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int a, b;
cin>>a;
if(a<=200)
cout<<"Rs."<<trunc(0.5*a);
else if(a<=400)
cout<<"Rs."<<(0.65*a)+100;
else if(a<=600)
cout<<"Rs."<<(0.80*a)+200;
else
cout<<"Rs."<<(1.25*a)+425;

return 0;
}
