#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float coins, ben, blackbeard, pirates;
  cin>>coins>>ben>>blackbeard;
  //cout<<coins<<endl<<ben<<endl;
  int ben_share = (int)((ben/100)*coins);
  int black_share = (int)((blackbeard/100)*(coins - ben_share));
  int pirates_share = (int)((coins - (ben_share + black_share))/3);
  cout<<ben_share<<endl<<black_share<<endl<<pirates_share;
  
}