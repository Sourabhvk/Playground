#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int a,b,first,last,sum;
cin >> a;
b=a;
first=a/1000;
last=b%10;
sum = first + last ;
std::cout << sum << std::endl;
}