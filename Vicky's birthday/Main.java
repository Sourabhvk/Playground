#include <iostream>
using namespace std;
int main()
{
int leapyear;
cin >> leapyear;
if (leapyear % 4 == 0)
{
if (leapyear % 100 == 0)
{
if (leapyear % 400 == 0)
{
cout <<"Vicky can celebrate his birthday.";
}
else
{
cout <<"Vicky can't celebrate.";
}
}
else
cout <<"Vicky can celebrate his birthday.";
}
else
cout <<"Vicky can't celebrate.";
return 0;
}

