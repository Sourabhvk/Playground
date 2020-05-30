#include<iostream>
using namespace std;
int main()
{
int R,C,T;
std::cin>>R>>C>>T;
if(R+C==T || (R+C)*2==T)
std::cout<<"It is a mango tree";
else 
std::cout<<"It is not a mango tree";
}
 