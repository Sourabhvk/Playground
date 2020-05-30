#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int famt,fdisc,fship;
int samt,sdisc,sship;
int aamt,adisc,aship;
int cflip,csnap,camazon;
std::cin >> famt>>fdisc>>fship;
std::cin >> samt>>sdisc>>sship;
std::cin >> aamt>>adisc>>aship;

cflip= famt-(famt*fdisc/100)+fship;
camazon= aamt-(aamt*adisc/100)+aship;
csnap= samt-(samt*sdisc/100)+sship; 

std::cout << "In Flipkart Rs." << cflip <<std::endl;
std::cout << "In Snapdeal Rs." << csnap <<std::endl;
std::cout << "In Amazon Rs." << camazon<< std::endl;

if (cflip<=camazon&&cflip<=csnap){
    std::cout << "He will prefer Flipkart" << std::endl;
}
else if (csnap<camazon&&csnap<cflip) {
    std::cout << "He will prefer Snapdeal" << std::endl;
} else {
    std::cout << "He will prefer Amazon" << std::endl;
}
return 0;
}