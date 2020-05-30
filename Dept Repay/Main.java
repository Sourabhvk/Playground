#include<iostream>

using namespace std;

int main()

{

int x,y,r;

double inter,amount,disc,finall;

cin>>x>>y>>r;

inter=(x*y*r)/100;
  
  cout<<inter<<endl;

amount=x+inter;
  
  cout<<amount<<endl;

disc=inter*2/100;
  
  cout<<disc<<endl;

finall=x+inter-disc;
  
  cout<<finall<<endl; 
  
return 0;

}
