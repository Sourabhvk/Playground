#include<iostream>
using namespace std;
int main()
{
int w,x,y;
int sp;
int cp;
int profit;
cin >> w ;
cin >> x;
cin >> y;
sp= w*x; 
cp= 100+(w*y);
profit=sp-cp;
cout << profit ;
return 0;
}