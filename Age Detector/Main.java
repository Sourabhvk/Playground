#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int b,c,age;
std::cin >> b>>c;
if (b>=c) {
    age=100-b+c;
    std::cout << age << std::endl;
}
else {
    age=c-b;
    std::cout << age << std::endl;
}
return 0;
}