#include<iostream>
int main()
{
int i,prod=1,n;    
 
 std::cin >> n;;    
  for(i=1;i<=n;i++)
  {    
      prod=prod*i;    
  }    
  std::cout << prod << std::endl; 
  return 0;  
}