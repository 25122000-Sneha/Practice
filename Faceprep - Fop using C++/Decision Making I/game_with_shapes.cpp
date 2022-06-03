#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, a;
  cin>>r>>a;
  int d = 2*r;
  if(d<=a)
  {
    cout<<"Circle can be inside a square";
  }
  else
  {
    cout<<"Circle cannot be inside a square";
  }
}