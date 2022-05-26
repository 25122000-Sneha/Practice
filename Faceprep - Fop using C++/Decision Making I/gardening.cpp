#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, t;
  cin>>r>>c>>t;
  if(r+c==t || (r+c)*2==t)
  {
    cout<<"It is an orange tree";
  }
  else{
    cout<<"It is not an orange tree";
  }
}