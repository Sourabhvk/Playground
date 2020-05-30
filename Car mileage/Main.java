#include<iostream>
using namespace std;
int main()
{
int mil,litres,dist;
std::cin >> mil >> litres >> dist;
if (mil*litres>=dist) {
    std::cout << "Can reach" << std::endl;
} else {
    std::cout << "Cannot reach" << std::endl;
}
return 0;
}