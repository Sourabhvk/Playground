#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum=0,a=0,temp,b=0,i=0;
  temp=n;
  b=n;
  while(b>0)
  {
  	b=b/10;
    i++;
  }
    while(n>0)
    {
    	a=n%10;
      n=n/10;
      sum=sum+power(a,i);
    }
  if(temp==sum)
  {
  	return 1;
  }
  else
  {
  	return 0;
  }
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}