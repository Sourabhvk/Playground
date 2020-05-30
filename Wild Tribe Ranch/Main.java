#include<iostream>
int main ()
{
int max, my;
std::cin>>max>>my;
if (max>my)
{
std::cout<<"Yes, you can enter.";
}
else if (max<my) 
{
std::cout<<"Sorry, you can't enter";
}
else if (max==my)
{
std::cout<<"Yes, you can enter. Kindly use a rope.";
}
return 0;
}
