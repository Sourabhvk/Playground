#include <iostream>
using namespace std;
int main()
{
int func,no1,no2;
cout<<"Enter first number : ";
cin>>no1;
cout<<"Enter second number : ";
cin>> no2;
cin>> func;
cout<<"Menu"<<"\n";
cout<<"1.Addition"<<"\n";
cout<<"2.Subtraction"<<"\n";
cout<<"3.Multiplication"<<"\n";
cout<<"4.Division"<<"\n";
cout<<"5.Remainder"<<"\n";
switch(func)
{
case 1:
cout<<no1+no2;
break;
case 2:
cout<<no1-no2;
break;
case 3:
cout<<no1*no2;
break;
case 4:
cout<<no1/no2;
break;
case 5:
cout<<no1%no2;
break;
default:
cout<<"Invalid operation";
}
return 0;
}