#include<iostream>
#include<cmath>
int main()
{
int wtallowed,wtactual,adutl,child;
std::cin >> wtallowed>>adutl>>child;
wtactual= (adutl*75)+(child*30);
if (wtactual<=wtallowed)
{
    std::cout << "Boat is stable" << std::endl;
}
else
{
    std::cout << "Boat will drow" << std::endl;
}

return 0;    
}