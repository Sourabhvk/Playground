#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    float side,rad,dia;
    std::cin >> rad;
    std::cin >> side;
    dia=2*rad;
    if (side>= dia){
        std::cout << "circle can be inside a square" << std::endl;
      } else {
        std::cout << "circle cannot be inside a square" << std::endl;
    }    
 return 0;
 
}